grammar myInterp;

options {
	language = Java;
	backtrack = true;
}

/*----------------------*/
/*        PARSER        */
/*----------------------*/

@header {
    import java.util.HashMap;
	import java.util.Scanner;
}

@members {
    boolean TRACEON = false;
    HashMap<String, Integer> memory = new HashMap<>();
}

program:
	Void Main LeftParen RightParen LeftBrace blockItemList[1] RightBrace {
        if (TRACEON) System.out.println("program        > void main () { blockItemList? }");
		};

blockItemList[int triger]:
	blockItem[$triger] blockItemList[$triger] {if (TRACEON) System.out.println("blockItemList  > blockItem blockItemList");
		}
	| {if (TRACEON) System.out.println("blockItemList  > ε");
		};

blockItem[int triger]:
	statement[$triger] {if (TRACEON) System.out.println("blockItem      > statement");
		}
	| declaration {if (TRACEON) System.out.println("blockItem      > declaration");
		};

typeSpecifier:
	Int {if (TRACEON) System.out.println("typeSpecifier       > Int");
		};

declaration:
	typeSpecifier a = Identifier (Comma b = Identifier)* Semi {
        if (TRACEON) System.out.println("declaration     > typeSpecifier Identifier (, Identifier)* ;");
        memory.put($a.text, 0);
        if($b.text != null)
            memory.put($b.text, 0);   
		};

statement[int triger]:
	compoundStatement[$triger] {
		if (TRACEON) System.out.println("statement      > compoundStatement");
		}
	| expressionStatement {
		if (TRACEON) System.out.println("statement      > expressionStatement");
		}
	| ifElseStatement {
		if (TRACEON) System.out.println("statement      > ifElseStatement");
		}
	| assignmentStatement[$triger] {
		if (TRACEON) System.out.println("statement      > assignmentStatement");
		}
	| scanfStatement {
		if (TRACEON) System.out.println("statement      > scanfStatement");
		}
	| printfStatement[$triger] {
		if (TRACEON) System.out.println("statement      > printfStatement");
		};

compoundStatement[int triger]:
	LeftBrace blockItemList[$triger] RightBrace {if (TRACEON) System.out.println("compoundStatement      > { blockItemList? }");
		};

expressionStatement:expression? Semi {if (TRACEON) System.out.println("expressionStatement     > expression? ;");
		};

expression
	returns[int val]:
	a = primaryExpression '+' b = expression {
        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
        $val = $a.val;
        $val = $val + $b.val;
		}
	| c = primaryExpression '-' d = expression {
        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
        $val = $c.val;
        $val = $val - $d.val;
		}
	| e = primaryExpression '*' f = expression {
        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
        $val = $e.val;
        $val = $val * $f.val;
		}
	| g = primaryExpression '/' h = expression {
        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
        $val = $g.val;
        $val = $val / $h.val;
		}
	| i = primaryExpression {
        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
        $val = $i.val;
		};

primaryExpression
	returns[int val]:
	a = Identifier {
        if (TRACEON) System.out.println("ID = " + $a.text);
        $val = memory.get($a.text);
        }
	| b = Constant {
        if (TRACEON) System.out.println("Constant = " + $b.text);
        $val = Integer.parseInt($b.text);
        }
	| LeftParen c = expression RightParen {
        if (TRACEON) System.out.println("primaryExpression        > ( expression )");
        $val = $c.val;
		};

ifElseStatement:
	If LeftParen a = conditionalExpression RightParen b = statement[$a.ans] Else c = statement[$a.ans*-1]
		{
        if (TRACEON) System.out.println("ifElseStatement> if ( conditionalExpression ) statement else statement");
		};

conditionalExpression
	returns[int ans]:
	a = expression Less b = expression {
		if (TRACEON) System.out.println("conditionalExpression   > expression < expression");
		if($a.val < $b.val)
			$ans = 1;
		else
			$ans = -1;
		}
	| c = expression Greater d = expression {
		if (TRACEON) System.out.println("conditionalExpression      > expression < expression");
		if($c.val > $d.val)
			$ans = 1;
		else
			$ans = -1;
		}
	| c = expression Equal d = expression {
		if (TRACEON) System.out.println("conditionalExpression      > expression < expression");
		if($c.val == $d.val)
			$ans = 1;
		else
			$ans = -1;
		}
	| LeftParen e = conditionalExpression RightParen {
		if (TRACEON) System.out.println("conditionalExpression     > ( conditionalExpression )");
		$ans = $e.ans;
		};

assignmentStatement[int triger]:
	assignmentExpression[$triger] Semi {

		if (TRACEON) System.out.println("assignmentStatement        > assignmentExpression ;");
		};

assignmentExpression[int triger]:
	a = Identifier Assign b = expression {
        if (TRACEON) System.out.println("assignmentExpression        > Identifier = expression");
		if($triger == 1)
		{
        	memory.put($a.text, new Integer($b.val));
		}
		};

printfStatement[int triger]:
	Printf LeftParen a = String (Comma b = value)* RightParen Semi {
        if (TRACEON) System.out.println("printfStatement     > print(String (, value)*);");
		if($triger == 1)
		{
			String str = $a.text;
			str = str.substring(1, str.length() - 1);

        	if($b.text != null)
            	System.out.printf(str,$b.val); 
        	else
            	System.out.printf(str);
		}
		};

scanfStatement:
	Scanf LeftParen String (Comma And a=value)* RightParen Semi {
		if (TRACEON) System.out.println("scanfStatement       > scanf(String (, &value)*);");
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();
		memory.put($a.text, new Integer(num));
		};

value
	returns[int val]:
	a = Identifier {
        if (TRACEON) System.out.println("value          > Identifier");
        $val = memory.get($a.text);
		}
	| b = Constant {
        if (TRACEON) System.out.println("value          > Constant");
        $val = Integer.parseInt($b.text);
		};
/*----------------------*/
/*         LEXER        */
/*----------------------*/

Auto: 'auto';
Break: 'break';
Case: 'case';
Char: 'char';
Const: 'const';
Continue: 'continue';
Default: 'default';
Do: 'do';
Double: 'double';
Else: 'else';
Enum: 'enum';
Extern: 'extern';
Float: 'float';
For: 'for';
Goto: 'goto';
If: 'if';
Inline: 'inline';
Int: 'int';
Long: 'long';
Register: 'register';
Restrict: 'restrict';
Return: 'return';
Short: 'short';
Signed: 'signed';
Sizeof: 'sizeof';
Static: 'static';
Struct: 'struct';
Switch: 'switch';
Typedef: 'typedef';
Union: 'union';
Unsigned: 'unsigned';
Void: 'void';
Volatile: 'volatile';
While: 'while';

Printf: 'printf';
Scanf: 'scanf';
Main: 'main';

Not: '!';
Less: '<';
LessEqual: '<=';
Greater: '>';
GreaterEqual: '>=';
Equal: '==';
NotEqual: '!=';
AndAnd: '&&';
OrOr: '||';

Plus: '+';
PlusPlus: '++';
Minus: '-';
MinusMinus: '--';
Star: '*';
Div: '/';
Mod: '%';
StarAssign: '*=';
DivAssign: '/=';
ModAssign: '%=';
PlusAssign: '+=';
MinusAssign: '-=';

Assign: '=';

LeftShift: '<<';
RightShift: '>>';
And: '&';
Or: '|';
Caret: '^';
LeftShiftAssign: '<<=';
RightShiftAssign: '>>=';
AndAssign: '&=';
XorAssign: '^=';
OrAssign: '|=';
Tilde: '~';

Comma: ',';
Question: '?';
Colon: ':';
Semi: ';';
Hastag: '#';

LeftParen: '(';
RightParen: ')';
LeftBracket: '[';
RightBracket: ']';
LeftBrace: '{';
RightBrace: '}';

Arrow: '->';
Dot: '.';

Identifier: Nondigit (Nondigit | Digit)*;
fragment Nondigit: 'a' ..'z' | 'A' ..'Z' | '_';
fragment Digit: '0' ..'9';

Constant: IntegerConstant;
// | CharacterConstant;
fragment IntegerConstant: ('0' | ('1' ..'9') (Digit)*);

String: '"' (.)* '"';

LineComment: '//' (.)* '\n'+ { skip(); };
BlockComment: '/*' (.)* '*/'+ { skip(); };

NewLine: ( '\r' '\n'? | '\n') { skip(); };
WhiteSpace: (' ' | '\r' | '\t')+ { skip(); };