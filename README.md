# Compiler Design Project 2

# Description

In this project, you should implement a simple C interpreter. The supported input file should at least contain the following features:
1. integer data type: int
2. Statements for arithmetic computation. (ex: a = b+2*(100-1))
3. Comparison expression. (ex: a > b)
4. if-then-else program construct.
5.  printf() function with one/two parameters. (supported type: %d)
6. scanf() function. (supported type: %d)

# How to Use

1. Make sure your JDK and ANTLR downloaded
2. Download the file from 
    https://github.com/MillerLee91915/compiler_design_project_3
3. use makefile to compile and execute 

after execution, you will execute sample code

# Grammer

grammar myInterp;

options {
	language = Java;
	backtrack = true;
}


@header {
    import java.util.HashMap;
	import java.util.Scanner;
}

@members {
    boolean TRACEON = false;
    HashMap<String, Integer> memory = new HashMap<>();
}

program:
	Void Main LeftParen RightParen LeftBrace blockItemList[1] RightBrace ;

blockItemList[int triger]:
	blockItem[$triger] blockItemList[$triger] }
	| ;

blockItem[int triger]:
	statement[$triger] 
	| declaration ;

typeSpecifier:
	Int ;

declaration:
	typeSpecifier a = Identifier (Comma b = Identifier)* Semi {
        
        if($b.text != null)
            memory.put($b.text, 0);   
		};

statement[int triger]:
	compoundStatement[$triger] 
	| expressionStatement 
	| ifElseStatement 
	| assignmentStatement[$triger] 
	| scanfStatement 
	| printfStatement[$triger] ;

compoundStatement[int triger]:
	LeftBrace blockItemList[$triger] RightBrace ;

expressionStatement:expression? Semi ;

expression
	returns[int val]:
	a = primaryExpression '+' b = expression {
        
        $val = $a.val;
        $val = $val + $b.val;
		}
	| c = primaryExpression '-' d = expression {
        
        $val = $c.val;
        $val = $val - $d.val;
		}
	| e = primaryExpression '*' f = expression {
       
        $val = $e.val;
        $val = $val * $f.val;
		}
	| g = primaryExpression '/' h = expression {
        
        $val = $g.val;
        $val = $val / $h.val;
		}
	| i = primaryExpression {
        
        $val = $i.val;
		};

primaryExpression
	returns[int val]:
	a = Identifier {
        
        $val = memory.get($a.text);
        }
	| b = Constant {
        $val = Integer.parseInt($b.text);
        }
	| LeftParen c = expression RightParen {
        $val = $c.val;
		};

ifElseStatement:
	If LeftParen a = conditionalExpression RightParen b = statement[$a.ans] Else c = statement[$a.ans*-1]
		;

conditionalExpression
	returns[int ans]:
	a = expression Less b = expression {
		if($a.val < $b.val)
			$ans = 1;
		else
			$ans = -1;
		}
	| c = expression Greater d = expression {
		if($c.val > $d.val)
			$ans = 1;
		else
			$ans = -1;
		}
	| c = expression Equal d = expression {
		if($c.val == $d.val)
			$ans = 1;
		else
			$ans = -1;
		}
	| LeftParen e = conditionalExpression RightParen {
		$ans = $e.ans;
		};

assignmentStatement[int triger]:
	assignmentExpression[$triger] Semi ;

assignmentExpression[int triger]:
	a = Identifier Assign b = expression {
       
		if($triger == 1)
		{
        	memory.put($a.text, new Integer($b.val));
		}
		};

printfStatement[int triger]:
	Printf LeftParen a = String (Comma b = value)* RightParen Semi {

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
		Scanner scanner = new Scanner(System.in);
		int num;
		num = scanner.nextInt();
		memory.put($a.text, new Integer(num));
		};

value
	returns[int val]:
	a = Identifier {
        $val = memory.get($a.text);
		}
	| b = Constant;

# Explain

We use two attribute to complete this project.
[int triger]
    triger is used to decide whether this statement need to be execute.
[int value ]
    value is used to calculate and store the value of identifier

