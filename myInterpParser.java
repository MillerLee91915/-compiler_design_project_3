// $ANTLR 3.5.2 myInterp.g 2022-05-15 21:11:49

    import java.util.HashMap;
	import java.util.Scanner;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myInterpParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "And", "AndAnd", "AndAssign", 
		"Arrow", "Assign", "Auto", "BlockComment", "Break", "Caret", "Case", "Char", 
		"Colon", "Comma", "Const", "Constant", "Continue", "Default", "Digit", 
		"Div", "DivAssign", "Do", "Dot", "Double", "Else", "Enum", "Equal", "Extern", 
		"Float", "For", "Goto", "Greater", "GreaterEqual", "Hastag", "Identifier", 
		"If", "Inline", "Int", "IntegerConstant", "LeftBrace", "LeftBracket", 
		"LeftParen", "LeftShift", "LeftShiftAssign", "Less", "LessEqual", "LineComment", 
		"Long", "Main", "Minus", "MinusAssign", "MinusMinus", "Mod", "ModAssign", 
		"NewLine", "Nondigit", "Not", "NotEqual", "Or", "OrAssign", "OrOr", "Plus", 
		"PlusAssign", "PlusPlus", "Printf", "Question", "Register", "Restrict", 
		"Return", "RightBrace", "RightBracket", "RightParen", "RightShift", "RightShiftAssign", 
		"Scanf", "Semi", "Short", "Signed", "Sizeof", "Star", "StarAssign", "Static", 
		"String", "Struct", "Switch", "Tilde", "Typedef", "Union", "Unsigned", 
		"Void", "Volatile", "While", "WhiteSpace", "XorAssign"
	};
	public static final int EOF=-1;
	public static final int And=4;
	public static final int AndAnd=5;
	public static final int AndAssign=6;
	public static final int Arrow=7;
	public static final int Assign=8;
	public static final int Auto=9;
	public static final int BlockComment=10;
	public static final int Break=11;
	public static final int Caret=12;
	public static final int Case=13;
	public static final int Char=14;
	public static final int Colon=15;
	public static final int Comma=16;
	public static final int Const=17;
	public static final int Constant=18;
	public static final int Continue=19;
	public static final int Default=20;
	public static final int Digit=21;
	public static final int Div=22;
	public static final int DivAssign=23;
	public static final int Do=24;
	public static final int Dot=25;
	public static final int Double=26;
	public static final int Else=27;
	public static final int Enum=28;
	public static final int Equal=29;
	public static final int Extern=30;
	public static final int Float=31;
	public static final int For=32;
	public static final int Goto=33;
	public static final int Greater=34;
	public static final int GreaterEqual=35;
	public static final int Hastag=36;
	public static final int Identifier=37;
	public static final int If=38;
	public static final int Inline=39;
	public static final int Int=40;
	public static final int IntegerConstant=41;
	public static final int LeftBrace=42;
	public static final int LeftBracket=43;
	public static final int LeftParen=44;
	public static final int LeftShift=45;
	public static final int LeftShiftAssign=46;
	public static final int Less=47;
	public static final int LessEqual=48;
	public static final int LineComment=49;
	public static final int Long=50;
	public static final int Main=51;
	public static final int Minus=52;
	public static final int MinusAssign=53;
	public static final int MinusMinus=54;
	public static final int Mod=55;
	public static final int ModAssign=56;
	public static final int NewLine=57;
	public static final int Nondigit=58;
	public static final int Not=59;
	public static final int NotEqual=60;
	public static final int Or=61;
	public static final int OrAssign=62;
	public static final int OrOr=63;
	public static final int Plus=64;
	public static final int PlusAssign=65;
	public static final int PlusPlus=66;
	public static final int Printf=67;
	public static final int Question=68;
	public static final int Register=69;
	public static final int Restrict=70;
	public static final int Return=71;
	public static final int RightBrace=72;
	public static final int RightBracket=73;
	public static final int RightParen=74;
	public static final int RightShift=75;
	public static final int RightShiftAssign=76;
	public static final int Scanf=77;
	public static final int Semi=78;
	public static final int Short=79;
	public static final int Signed=80;
	public static final int Sizeof=81;
	public static final int Star=82;
	public static final int StarAssign=83;
	public static final int Static=84;
	public static final int String=85;
	public static final int Struct=86;
	public static final int Switch=87;
	public static final int Tilde=88;
	public static final int Typedef=89;
	public static final int Union=90;
	public static final int Unsigned=91;
	public static final int Void=92;
	public static final int Volatile=93;
	public static final int While=94;
	public static final int WhiteSpace=95;
	public static final int XorAssign=96;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myInterpParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myInterpParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myInterpParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myInterp.g"; }


	    boolean TRACEON = false;
	    HashMap<String, Integer> memory = new HashMap<>();



	// $ANTLR start "program"
	// myInterp.g:22:1: program : Void Main LeftParen RightParen LeftBrace blockItemList[1] RightBrace ;
	public final void program() throws RecognitionException {
		try {
			// myInterp.g:22:8: ( Void Main LeftParen RightParen LeftBrace blockItemList[1] RightBrace )
			// myInterp.g:23:2: Void Main LeftParen RightParen LeftBrace blockItemList[1] RightBrace
			{
			match(input,Void,FOLLOW_Void_in_program50); if (state.failed) return;
			match(input,Main,FOLLOW_Main_in_program52); if (state.failed) return;
			match(input,LeftParen,FOLLOW_LeftParen_in_program54); if (state.failed) return;
			match(input,RightParen,FOLLOW_RightParen_in_program56); if (state.failed) return;
			match(input,LeftBrace,FOLLOW_LeftBrace_in_program58); if (state.failed) return;
			pushFollow(FOLLOW_blockItemList_in_program60);
			blockItemList(1);
			state._fsp--;
			if (state.failed) return;
			match(input,RightBrace,FOLLOW_RightBrace_in_program63); if (state.failed) return;
			if ( state.backtracking==0 ) {
			        if (TRACEON) System.out.println("program        > void main () { blockItemList? }");
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "blockItemList"
	// myInterp.g:27:1: blockItemList[int triger] : ( blockItem[$triger] blockItemList[$triger] |);
	public final void blockItemList(int triger) throws RecognitionException {
		try {
			// myInterp.g:27:26: ( blockItem[$triger] blockItemList[$triger] |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==Constant||(LA1_0 >= Identifier && LA1_0 <= If)||LA1_0==Int||LA1_0==LeftBrace||LA1_0==LeftParen||LA1_0==Printf||(LA1_0 >= Scanf && LA1_0 <= Semi)) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF||LA1_0==RightBrace) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myInterp.g:28:2: blockItem[$triger] blockItemList[$triger]
					{
					pushFollow(FOLLOW_blockItem_in_blockItemList74);
					blockItem(triger);
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_blockItemList_in_blockItemList77);
					blockItemList(triger);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("blockItemList  > blockItem blockItemList");
							}
					}
					break;
				case 2 :
					// myInterp.g:30:4: 
					{
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("blockItemList  > ε");
							}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "blockItemList"



	// $ANTLR start "blockItem"
	// myInterp.g:33:1: blockItem[int triger] : ( statement[$triger] | declaration );
	public final void blockItem(int triger) throws RecognitionException {
		try {
			// myInterp.g:33:22: ( statement[$triger] | declaration )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Constant||(LA2_0 >= Identifier && LA2_0 <= If)||LA2_0==LeftBrace||LA2_0==LeftParen||LA2_0==Printf||(LA2_0 >= Scanf && LA2_0 <= Semi)) ) {
				alt2=1;
			}
			else if ( (LA2_0==Int) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myInterp.g:34:2: statement[$triger]
					{
					pushFollow(FOLLOW_statement_in_blockItem94);
					statement(triger);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("blockItem      > statement");
							}
					}
					break;
				case 2 :
					// myInterp.g:36:4: declaration
					{
					pushFollow(FOLLOW_declaration_in_blockItem102);
					declaration();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {if (TRACEON) System.out.println("blockItem      > declaration");
							}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "blockItem"



	// $ANTLR start "typeSpecifier"
	// myInterp.g:39:1: typeSpecifier : Int ;
	public final void typeSpecifier() throws RecognitionException {
		try {
			// myInterp.g:39:14: ( Int )
			// myInterp.g:40:2: Int
			{
			match(input,Int,FOLLOW_Int_in_typeSpecifier112); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("typeSpecifier       > Int");
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "typeSpecifier"



	// $ANTLR start "declaration"
	// myInterp.g:43:1: declaration : typeSpecifier a= Identifier ( Comma b= Identifier )* Semi ;
	public final void declaration() throws RecognitionException {
		Token a=null;
		Token b=null;

		try {
			// myInterp.g:43:12: ( typeSpecifier a= Identifier ( Comma b= Identifier )* Semi )
			// myInterp.g:44:2: typeSpecifier a= Identifier ( Comma b= Identifier )* Semi
			{
			pushFollow(FOLLOW_typeSpecifier_in_declaration122);
			typeSpecifier();
			state._fsp--;
			if (state.failed) return;
			a=(Token)match(input,Identifier,FOLLOW_Identifier_in_declaration128); if (state.failed) return;
			// myInterp.g:44:31: ( Comma b= Identifier )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==Comma) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myInterp.g:44:32: Comma b= Identifier
					{
					match(input,Comma,FOLLOW_Comma_in_declaration131); if (state.failed) return;
					b=(Token)match(input,Identifier,FOLLOW_Identifier_in_declaration137); if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,Semi,FOLLOW_Semi_in_declaration141); if (state.failed) return;
			if ( state.backtracking==0 ) {
			        if (TRACEON) System.out.println("declaration     > typeSpecifier Identifier (, Identifier)* ;");
			        memory.put((a!=null?a.getText():null), 0);
			        if((b!=null?b.getText():null) != null)
			            memory.put((b!=null?b.getText():null), 0);   
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "statement"
	// myInterp.g:51:1: statement[int triger] : ( compoundStatement[$triger] | expressionStatement | ifElseStatement | assignmentStatement[$triger] | scanfStatement | printfStatement[$triger] );
	public final void statement(int triger) throws RecognitionException {
		try {
			// myInterp.g:51:22: ( compoundStatement[$triger] | expressionStatement | ifElseStatement | assignmentStatement[$triger] | scanfStatement | printfStatement[$triger] )
			int alt4=6;
			switch ( input.LA(1) ) {
			case LeftBrace:
				{
				alt4=1;
				}
				break;
			case Identifier:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==Assign) ) {
					alt4=4;
				}
				else if ( (LA4_2==Div||LA4_2==Minus||LA4_2==Plus||LA4_2==Semi||LA4_2==Star) ) {
					alt4=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Constant:
			case LeftParen:
			case Semi:
				{
				alt4=2;
				}
				break;
			case If:
				{
				alt4=3;
				}
				break;
			case Scanf:
				{
				alt4=5;
				}
				break;
			case Printf:
				{
				alt4=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myInterp.g:52:2: compoundStatement[$triger]
					{
					pushFollow(FOLLOW_compoundStatement_in_statement152);
					compoundStatement(triger);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("statement      > compoundStatement");
							}
					}
					break;
				case 2 :
					// myInterp.g:55:4: expressionStatement
					{
					pushFollow(FOLLOW_expressionStatement_in_statement160);
					expressionStatement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("statement      > expressionStatement");
							}
					}
					break;
				case 3 :
					// myInterp.g:58:4: ifElseStatement
					{
					pushFollow(FOLLOW_ifElseStatement_in_statement167);
					ifElseStatement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("statement      > ifElseStatement");
							}
					}
					break;
				case 4 :
					// myInterp.g:61:4: assignmentStatement[$triger]
					{
					pushFollow(FOLLOW_assignmentStatement_in_statement174);
					assignmentStatement(triger);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("statement      > assignmentStatement");
							}
					}
					break;
				case 5 :
					// myInterp.g:64:4: scanfStatement
					{
					pushFollow(FOLLOW_scanfStatement_in_statement182);
					scanfStatement();
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("statement      > scanfStatement");
							}
					}
					break;
				case 6 :
					// myInterp.g:67:4: printfStatement[$triger]
					{
					pushFollow(FOLLOW_printfStatement_in_statement189);
					printfStatement(triger);
					state._fsp--;
					if (state.failed) return;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("statement      > printfStatement");
							}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "compoundStatement"
	// myInterp.g:71:1: compoundStatement[int triger] : LeftBrace blockItemList[$triger] RightBrace ;
	public final void compoundStatement(int triger) throws RecognitionException {
		try {
			// myInterp.g:71:30: ( LeftBrace blockItemList[$triger] RightBrace )
			// myInterp.g:72:2: LeftBrace blockItemList[$triger] RightBrace
			{
			match(input,LeftBrace,FOLLOW_LeftBrace_in_compoundStatement201); if (state.failed) return;
			pushFollow(FOLLOW_blockItemList_in_compoundStatement203);
			blockItemList(triger);
			state._fsp--;
			if (state.failed) return;
			match(input,RightBrace,FOLLOW_RightBrace_in_compoundStatement206); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("compoundStatement      > { blockItemList? }");
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "compoundStatement"



	// $ANTLR start "expressionStatement"
	// myInterp.g:75:1: expressionStatement : ( expression )? Semi ;
	public final void expressionStatement() throws RecognitionException {
		try {
			// myInterp.g:75:20: ( ( expression )? Semi )
			// myInterp.g:75:21: ( expression )? Semi
			{
			// myInterp.g:75:21: ( expression )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Constant||LA5_0==Identifier||LA5_0==LeftParen) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// myInterp.g:75:21: expression
					{
					pushFollow(FOLLOW_expression_in_expressionStatement214);
					expression();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,Semi,FOLLOW_Semi_in_expressionStatement217); if (state.failed) return;
			if ( state.backtracking==0 ) {if (TRACEON) System.out.println("expressionStatement     > expression? ;");
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expressionStatement"



	// $ANTLR start "expression"
	// myInterp.g:78:1: expression returns [int val] : (a= primaryExpression '+' b= expression |c= primaryExpression '-' d= expression |e= primaryExpression '*' f= expression |g= primaryExpression '/' h= expression |i= primaryExpression );
	public final int expression() throws RecognitionException {
		int val = 0;


		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;
		int f =0;
		int g =0;
		int h =0;
		int i =0;

		try {
			// myInterp.g:79:18: (a= primaryExpression '+' b= expression |c= primaryExpression '-' d= expression |e= primaryExpression '*' f= expression |g= primaryExpression '/' h= expression |i= primaryExpression )
			int alt6=5;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA6_1 = input.LA(2);
				if ( (synpred10_myInterp()) ) {
					alt6=1;
				}
				else if ( (synpred11_myInterp()) ) {
					alt6=2;
				}
				else if ( (synpred12_myInterp()) ) {
					alt6=3;
				}
				else if ( (synpred13_myInterp()) ) {
					alt6=4;
				}
				else if ( (true) ) {
					alt6=5;
				}

				}
				break;
			case Constant:
				{
				int LA6_2 = input.LA(2);
				if ( (synpred10_myInterp()) ) {
					alt6=1;
				}
				else if ( (synpred11_myInterp()) ) {
					alt6=2;
				}
				else if ( (synpred12_myInterp()) ) {
					alt6=3;
				}
				else if ( (synpred13_myInterp()) ) {
					alt6=4;
				}
				else if ( (true) ) {
					alt6=5;
				}

				}
				break;
			case LeftParen:
				{
				int LA6_3 = input.LA(2);
				if ( (synpred10_myInterp()) ) {
					alt6=1;
				}
				else if ( (synpred11_myInterp()) ) {
					alt6=2;
				}
				else if ( (synpred12_myInterp()) ) {
					alt6=3;
				}
				else if ( (synpred13_myInterp()) ) {
					alt6=4;
				}
				else if ( (true) ) {
					alt6=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// myInterp.g:80:2: a= primaryExpression '+' b= expression
					{
					pushFollow(FOLLOW_primaryExpression_in_expression235);
					a=primaryExpression();
					state._fsp--;
					if (state.failed) return val;
					match(input,Plus,FOLLOW_Plus_in_expression237); if (state.failed) return val;
					pushFollow(FOLLOW_expression_in_expression243);
					b=expression();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
					        val = a;
					        val = val + b;
							}
					}
					break;
				case 2 :
					// myInterp.g:85:4: c= primaryExpression '-' d= expression
					{
					pushFollow(FOLLOW_primaryExpression_in_expression254);
					c=primaryExpression();
					state._fsp--;
					if (state.failed) return val;
					match(input,Minus,FOLLOW_Minus_in_expression256); if (state.failed) return val;
					pushFollow(FOLLOW_expression_in_expression262);
					d=expression();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
					        val = c;
					        val = val - d;
							}
					}
					break;
				case 3 :
					// myInterp.g:90:4: e= primaryExpression '*' f= expression
					{
					pushFollow(FOLLOW_primaryExpression_in_expression273);
					e=primaryExpression();
					state._fsp--;
					if (state.failed) return val;
					match(input,Star,FOLLOW_Star_in_expression275); if (state.failed) return val;
					pushFollow(FOLLOW_expression_in_expression281);
					f=expression();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
					        val = e;
					        val = val * f;
							}
					}
					break;
				case 4 :
					// myInterp.g:95:4: g= primaryExpression '/' h= expression
					{
					pushFollow(FOLLOW_primaryExpression_in_expression292);
					g=primaryExpression();
					state._fsp--;
					if (state.failed) return val;
					match(input,Div,FOLLOW_Div_in_expression294); if (state.failed) return val;
					pushFollow(FOLLOW_expression_in_expression300);
					h=expression();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
					        val = g;
					        val = val / h;
							}
					}
					break;
				case 5 :
					// myInterp.g:100:4: i= primaryExpression
					{
					pushFollow(FOLLOW_primaryExpression_in_expression311);
					i=primaryExpression();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("expression     > primaryExpression + expression");
					        val = i;
							}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "expression"



	// $ANTLR start "primaryExpression"
	// myInterp.g:105:1: primaryExpression returns [int val] : (a= Identifier |b= Constant | LeftParen c= expression RightParen );
	public final int primaryExpression() throws RecognitionException {
		int val = 0;


		Token a=null;
		Token b=null;
		int c =0;

		try {
			// myInterp.g:106:18: (a= Identifier |b= Constant | LeftParen c= expression RightParen )
			int alt7=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt7=1;
				}
				break;
			case Constant:
				{
				alt7=2;
				}
				break;
			case LeftParen:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// myInterp.g:107:2: a= Identifier
					{
					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpression329); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("ID = " + (a!=null?a.getText():null));
					        val = memory.get((a!=null?a.getText():null));
					        }
					}
					break;
				case 2 :
					// myInterp.g:111:4: b= Constant
					{
					b=(Token)match(input,Constant,FOLLOW_Constant_in_primaryExpression340); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("Constant = " + (b!=null?b.getText():null));
					        val = Integer.parseInt((b!=null?b.getText():null));
					        }
					}
					break;
				case 3 :
					// myInterp.g:115:4: LeftParen c= expression RightParen
					{
					match(input,LeftParen,FOLLOW_LeftParen_in_primaryExpression347); if (state.failed) return val;
					pushFollow(FOLLOW_expression_in_primaryExpression353);
					c=expression();
					state._fsp--;
					if (state.failed) return val;
					match(input,RightParen,FOLLOW_RightParen_in_primaryExpression355); if (state.failed) return val;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("primaryExpression        > ( expression )");
					        val = c;
							}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "primaryExpression"



	// $ANTLR start "ifElseStatement"
	// myInterp.g:120:1: ifElseStatement : If LeftParen a= conditionalExpression RightParen b= statement[$a.ans] Else c= statement[$a.ans*-1] ;
	public final void ifElseStatement() throws RecognitionException {
		int a =0;

		try {
			// myInterp.g:120:16: ( If LeftParen a= conditionalExpression RightParen b= statement[$a.ans] Else c= statement[$a.ans*-1] )
			// myInterp.g:121:2: If LeftParen a= conditionalExpression RightParen b= statement[$a.ans] Else c= statement[$a.ans*-1]
			{
			match(input,If,FOLLOW_If_in_ifElseStatement365); if (state.failed) return;
			match(input,LeftParen,FOLLOW_LeftParen_in_ifElseStatement367); if (state.failed) return;
			pushFollow(FOLLOW_conditionalExpression_in_ifElseStatement373);
			a=conditionalExpression();
			state._fsp--;
			if (state.failed) return;
			match(input,RightParen,FOLLOW_RightParen_in_ifElseStatement375); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifElseStatement381);
			statement(a);
			state._fsp--;
			if (state.failed) return;
			match(input,Else,FOLLOW_Else_in_ifElseStatement384); if (state.failed) return;
			pushFollow(FOLLOW_statement_in_ifElseStatement390);
			statement(a*-1);
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			        if (TRACEON) System.out.println("ifElseStatement> if ( conditionalExpression ) statement else statement");
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ifElseStatement"



	// $ANTLR start "conditionalExpression"
	// myInterp.g:126:1: conditionalExpression returns [int ans] : (a= expression Less b= expression |c= expression Greater d= expression |c= expression Equal d= expression | LeftParen e= conditionalExpression RightParen );
	public final int conditionalExpression() throws RecognitionException {
		int ans = 0;


		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int e =0;

		try {
			// myInterp.g:127:18: (a= expression Less b= expression |c= expression Greater d= expression |c= expression Equal d= expression | LeftParen e= conditionalExpression RightParen )
			int alt8=4;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA8_1 = input.LA(2);
				if ( (synpred16_myInterp()) ) {
					alt8=1;
				}
				else if ( (synpred17_myInterp()) ) {
					alt8=2;
				}
				else if ( (synpred18_myInterp()) ) {
					alt8=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return ans;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Constant:
				{
				int LA8_2 = input.LA(2);
				if ( (synpred16_myInterp()) ) {
					alt8=1;
				}
				else if ( (synpred17_myInterp()) ) {
					alt8=2;
				}
				else if ( (synpred18_myInterp()) ) {
					alt8=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return ans;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LeftParen:
				{
				int LA8_3 = input.LA(2);
				if ( (synpred16_myInterp()) ) {
					alt8=1;
				}
				else if ( (synpred17_myInterp()) ) {
					alt8=2;
				}
				else if ( (synpred18_myInterp()) ) {
					alt8=3;
				}
				else if ( (true) ) {
					alt8=4;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return ans;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myInterp.g:128:2: a= expression Less b= expression
					{
					pushFollow(FOLLOW_expression_in_conditionalExpression411);
					a=expression();
					state._fsp--;
					if (state.failed) return ans;
					match(input,Less,FOLLOW_Less_in_conditionalExpression413); if (state.failed) return ans;
					pushFollow(FOLLOW_expression_in_conditionalExpression419);
					b=expression();
					state._fsp--;
					if (state.failed) return ans;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("conditionalExpression   > expression < expression");
							if(a < b)
								ans = 1;
							else
								ans = -1;
							}
					}
					break;
				case 2 :
					// myInterp.g:135:4: c= expression Greater d= expression
					{
					pushFollow(FOLLOW_expression_in_conditionalExpression430);
					c=expression();
					state._fsp--;
					if (state.failed) return ans;
					match(input,Greater,FOLLOW_Greater_in_conditionalExpression432); if (state.failed) return ans;
					pushFollow(FOLLOW_expression_in_conditionalExpression438);
					d=expression();
					state._fsp--;
					if (state.failed) return ans;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("conditionalExpression      > expression < expression");
							if(c > d)
								ans = 1;
							else
								ans = -1;
							}
					}
					break;
				case 3 :
					// myInterp.g:142:4: c= expression Equal d= expression
					{
					pushFollow(FOLLOW_expression_in_conditionalExpression449);
					c=expression();
					state._fsp--;
					if (state.failed) return ans;
					match(input,Equal,FOLLOW_Equal_in_conditionalExpression451); if (state.failed) return ans;
					pushFollow(FOLLOW_expression_in_conditionalExpression457);
					d=expression();
					state._fsp--;
					if (state.failed) return ans;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("conditionalExpression      > expression < expression");
							if(c == d)
								ans = 1;
							else
								ans = -1;
							}
					}
					break;
				case 4 :
					// myInterp.g:149:4: LeftParen e= conditionalExpression RightParen
					{
					match(input,LeftParen,FOLLOW_LeftParen_in_conditionalExpression464); if (state.failed) return ans;
					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression470);
					e=conditionalExpression();
					state._fsp--;
					if (state.failed) return ans;
					match(input,RightParen,FOLLOW_RightParen_in_conditionalExpression472); if (state.failed) return ans;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("conditionalExpression     > ( conditionalExpression )");
							ans = e;
							}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ans;
	}
	// $ANTLR end "conditionalExpression"



	// $ANTLR start "assignmentStatement"
	// myInterp.g:154:1: assignmentStatement[int triger] : assignmentExpression[$triger] Semi ;
	public final void assignmentStatement(int triger) throws RecognitionException {
		try {
			// myInterp.g:154:32: ( assignmentExpression[$triger] Semi )
			// myInterp.g:155:2: assignmentExpression[$triger] Semi
			{
			pushFollow(FOLLOW_assignmentExpression_in_assignmentStatement483);
			assignmentExpression(triger);
			state._fsp--;
			if (state.failed) return;
			match(input,Semi,FOLLOW_Semi_in_assignmentStatement486); if (state.failed) return;
			if ( state.backtracking==0 ) {

					if (TRACEON) System.out.println("assignmentStatement        > assignmentExpression ;");
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignmentStatement"



	// $ANTLR start "assignmentExpression"
	// myInterp.g:160:1: assignmentExpression[int triger] : a= Identifier Assign b= expression ;
	public final void assignmentExpression(int triger) throws RecognitionException {
		Token a=null;
		int b =0;

		try {
			// myInterp.g:160:33: (a= Identifier Assign b= expression )
			// myInterp.g:161:2: a= Identifier Assign b= expression
			{
			a=(Token)match(input,Identifier,FOLLOW_Identifier_in_assignmentExpression501); if (state.failed) return;
			match(input,Assign,FOLLOW_Assign_in_assignmentExpression503); if (state.failed) return;
			pushFollow(FOLLOW_expression_in_assignmentExpression509);
			b=expression();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {
			        if (TRACEON) System.out.println("assignmentExpression        > Identifier = expression");
					if(triger == 1)
					{
			        	memory.put((a!=null?a.getText():null), new Integer(b));
					}
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignmentExpression"



	// $ANTLR start "printfStatement"
	// myInterp.g:169:1: printfStatement[int triger] : Printf LeftParen a= String ( Comma b= value )* RightParen Semi ;
	public final void printfStatement(int triger) throws RecognitionException {
		Token a=null;
		ParserRuleReturnScope b =null;

		try {
			// myInterp.g:169:28: ( Printf LeftParen a= String ( Comma b= value )* RightParen Semi )
			// myInterp.g:170:2: Printf LeftParen a= String ( Comma b= value )* RightParen Semi
			{
			match(input,Printf,FOLLOW_Printf_in_printfStatement520); if (state.failed) return;
			match(input,LeftParen,FOLLOW_LeftParen_in_printfStatement522); if (state.failed) return;
			a=(Token)match(input,String,FOLLOW_String_in_printfStatement528); if (state.failed) return;
			// myInterp.g:170:30: ( Comma b= value )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==Comma) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myInterp.g:170:31: Comma b= value
					{
					match(input,Comma,FOLLOW_Comma_in_printfStatement531); if (state.failed) return;
					pushFollow(FOLLOW_value_in_printfStatement537);
					b=value();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,RightParen,FOLLOW_RightParen_in_printfStatement541); if (state.failed) return;
			match(input,Semi,FOLLOW_Semi_in_printfStatement543); if (state.failed) return;
			if ( state.backtracking==0 ) {
			        if (TRACEON) System.out.println("printfStatement     > print(String (, value)*);");
					if(triger == 1)
					{
						String str = (a!=null?a.getText():null);
						str = str.substring(1, str.length() - 1);

			        	if((b!=null?input.toString(b.start,b.stop):null) != null)
			            	System.out.printf(str,(b!=null?((myInterpParser.value_return)b).val:0)); 
			        	else
			            	System.out.printf(str);
					}
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printfStatement"



	// $ANTLR start "scanfStatement"
	// myInterp.g:184:1: scanfStatement : Scanf LeftParen String ( Comma And a= value )* RightParen Semi ;
	public final void scanfStatement() throws RecognitionException {
		ParserRuleReturnScope a =null;

		try {
			// myInterp.g:184:15: ( Scanf LeftParen String ( Comma And a= value )* RightParen Semi )
			// myInterp.g:185:2: Scanf LeftParen String ( Comma And a= value )* RightParen Semi
			{
			match(input,Scanf,FOLLOW_Scanf_in_scanfStatement553); if (state.failed) return;
			match(input,LeftParen,FOLLOW_LeftParen_in_scanfStatement555); if (state.failed) return;
			match(input,String,FOLLOW_String_in_scanfStatement557); if (state.failed) return;
			// myInterp.g:185:25: ( Comma And a= value )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==Comma) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myInterp.g:185:26: Comma And a= value
					{
					match(input,Comma,FOLLOW_Comma_in_scanfStatement560); if (state.failed) return;
					match(input,And,FOLLOW_And_in_scanfStatement562); if (state.failed) return;
					pushFollow(FOLLOW_value_in_scanfStatement566);
					a=value();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop10;
				}
			}

			match(input,RightParen,FOLLOW_RightParen_in_scanfStatement570); if (state.failed) return;
			match(input,Semi,FOLLOW_Semi_in_scanfStatement572); if (state.failed) return;
			if ( state.backtracking==0 ) {
					if (TRACEON) System.out.println("scanfStatement       > scanf(String (, &value)*);");
					Scanner scanner = new Scanner(System.in);
					int num;
					num = scanner.nextInt();
					memory.put((a!=null?input.toString(a.start,a.stop):null), new Integer(num));
					}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "scanfStatement"


	public static class value_return extends ParserRuleReturnScope {
		public int val;
	};


	// $ANTLR start "value"
	// myInterp.g:193:1: value returns [int val] : (a= Identifier |b= Constant );
	public final myInterpParser.value_return value() throws RecognitionException {
		myInterpParser.value_return retval = new myInterpParser.value_return();
		retval.start = input.LT(1);

		Token a=null;
		Token b=null;

		try {
			// myInterp.g:194:18: (a= Identifier |b= Constant )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Identifier) ) {
				alt11=1;
			}
			else if ( (LA11_0==Constant) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myInterp.g:195:2: a= Identifier
					{
					a=(Token)match(input,Identifier,FOLLOW_Identifier_in_value590); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("value          > Identifier");
					        retval.val = memory.get((a!=null?a.getText():null));
							}
					}
					break;
				case 2 :
					// myInterp.g:199:4: b= Constant
					{
					b=(Token)match(input,Constant,FOLLOW_Constant_in_value601); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					        if (TRACEON) System.out.println("value          > Constant");
					        retval.val = Integer.parseInt((b!=null?b.getText():null));
							}
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"

	// $ANTLR start synpred10_myInterp
	public final void synpred10_myInterp_fragment() throws RecognitionException {
		int a =0;
		int b =0;

		// myInterp.g:80:2: (a= primaryExpression '+' b= expression )
		// myInterp.g:80:2: a= primaryExpression '+' b= expression
		{
		pushFollow(FOLLOW_primaryExpression_in_synpred10_myInterp235);
		a=primaryExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,Plus,FOLLOW_Plus_in_synpred10_myInterp237); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred10_myInterp243);
		b=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_myInterp

	// $ANTLR start synpred11_myInterp
	public final void synpred11_myInterp_fragment() throws RecognitionException {
		int c =0;
		int d =0;

		// myInterp.g:85:4: (c= primaryExpression '-' d= expression )
		// myInterp.g:85:4: c= primaryExpression '-' d= expression
		{
		pushFollow(FOLLOW_primaryExpression_in_synpred11_myInterp254);
		c=primaryExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,Minus,FOLLOW_Minus_in_synpred11_myInterp256); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred11_myInterp262);
		d=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred11_myInterp

	// $ANTLR start synpred12_myInterp
	public final void synpred12_myInterp_fragment() throws RecognitionException {
		int e =0;
		int f =0;

		// myInterp.g:90:4: (e= primaryExpression '*' f= expression )
		// myInterp.g:90:4: e= primaryExpression '*' f= expression
		{
		pushFollow(FOLLOW_primaryExpression_in_synpred12_myInterp273);
		e=primaryExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,Star,FOLLOW_Star_in_synpred12_myInterp275); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred12_myInterp281);
		f=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred12_myInterp

	// $ANTLR start synpred13_myInterp
	public final void synpred13_myInterp_fragment() throws RecognitionException {
		int g =0;
		int h =0;

		// myInterp.g:95:4: (g= primaryExpression '/' h= expression )
		// myInterp.g:95:4: g= primaryExpression '/' h= expression
		{
		pushFollow(FOLLOW_primaryExpression_in_synpred13_myInterp292);
		g=primaryExpression();
		state._fsp--;
		if (state.failed) return;
		match(input,Div,FOLLOW_Div_in_synpred13_myInterp294); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred13_myInterp300);
		h=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_myInterp

	// $ANTLR start synpred16_myInterp
	public final void synpred16_myInterp_fragment() throws RecognitionException {
		int a =0;
		int b =0;

		// myInterp.g:128:2: (a= expression Less b= expression )
		// myInterp.g:128:2: a= expression Less b= expression
		{
		pushFollow(FOLLOW_expression_in_synpred16_myInterp411);
		a=expression();
		state._fsp--;
		if (state.failed) return;
		match(input,Less,FOLLOW_Less_in_synpred16_myInterp413); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred16_myInterp419);
		b=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred16_myInterp

	// $ANTLR start synpred17_myInterp
	public final void synpred17_myInterp_fragment() throws RecognitionException {
		int c =0;
		int d =0;

		// myInterp.g:135:4: (c= expression Greater d= expression )
		// myInterp.g:135:4: c= expression Greater d= expression
		{
		pushFollow(FOLLOW_expression_in_synpred17_myInterp430);
		c=expression();
		state._fsp--;
		if (state.failed) return;
		match(input,Greater,FOLLOW_Greater_in_synpred17_myInterp432); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred17_myInterp438);
		d=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred17_myInterp

	// $ANTLR start synpred18_myInterp
	public final void synpred18_myInterp_fragment() throws RecognitionException {
		int c =0;
		int d =0;

		// myInterp.g:142:4: (c= expression Equal d= expression )
		// myInterp.g:142:4: c= expression Equal d= expression
		{
		pushFollow(FOLLOW_expression_in_synpred18_myInterp449);
		c=expression();
		state._fsp--;
		if (state.failed) return;
		match(input,Equal,FOLLOW_Equal_in_synpred18_myInterp451); if (state.failed) return;
		pushFollow(FOLLOW_expression_in_synpred18_myInterp457);
		d=expression();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred18_myInterp

	// Delegated rules

	public final boolean synpred12_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_myInterp() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_myInterp_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_Void_in_program50 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_Main_in_program52 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LeftParen_in_program54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RightParen_in_program56 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_LeftBrace_in_program58 = new BitSet(new long[]{0x0000156000040000L,0x0000000000006108L});
	public static final BitSet FOLLOW_blockItemList_in_program60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RightBrace_in_program63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_blockItem_in_blockItemList74 = new BitSet(new long[]{0x0000156000040000L,0x0000000000006008L});
	public static final BitSet FOLLOW_blockItemList_in_blockItemList77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_blockItem94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_blockItem102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_typeSpecifier112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeSpecifier_in_declaration122 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_declaration128 = new BitSet(new long[]{0x0000000000010000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Comma_in_declaration131 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_Identifier_in_declaration137 = new BitSet(new long[]{0x0000000000010000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Semi_in_declaration141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundStatement_in_statement152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressionStatement_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifElseStatement_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentStatement_in_statement174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scanfStatement_in_statement182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printfStatement_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftBrace_in_compoundStatement201 = new BitSet(new long[]{0x0000156000040000L,0x0000000000006108L});
	public static final BitSet FOLLOW_blockItemList_in_compoundStatement203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RightBrace_in_compoundStatement206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionStatement214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Semi_in_expressionStatement217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_expression235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_Plus_in_expression237 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_expression243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_expression254 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Minus_in_expression256 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_expression262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_expression273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_Star_in_expression275 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_expression281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_expression292 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Div_in_expression294 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_expression300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_expression311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpression329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Constant_in_primaryExpression340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParen_in_primaryExpression347 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_primaryExpression353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RightParen_in_primaryExpression355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifElseStatement365 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LeftParen_in_ifElseStatement367 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_conditionalExpression_in_ifElseStatement373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RightParen_in_ifElseStatement375 = new BitSet(new long[]{0x0000146000040000L,0x0000000000006008L});
	public static final BitSet FOLLOW_statement_in_ifElseStatement381 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Else_in_ifElseStatement384 = new BitSet(new long[]{0x0000146000040000L,0x0000000000006008L});
	public static final BitSet FOLLOW_statement_in_ifElseStatement390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression411 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_Less_in_conditionalExpression413 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression430 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Greater_in_conditionalExpression432 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression449 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Equal_in_conditionalExpression451 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LeftParen_in_conditionalExpression464 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RightParen_in_conditionalExpression472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentExpression_in_assignmentStatement483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Semi_in_assignmentStatement486 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_assignmentExpression501 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Assign_in_assignmentExpression503 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_assignmentExpression509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Printf_in_printfStatement520 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LeftParen_in_printfStatement522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_String_in_printfStatement528 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Comma_in_printfStatement531 = new BitSet(new long[]{0x0000002000040000L});
	public static final BitSet FOLLOW_value_in_printfStatement537 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RightParen_in_printfStatement541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Semi_in_printfStatement543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Scanf_in_scanfStatement553 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_LeftParen_in_scanfStatement555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_String_in_scanfStatement557 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000400L});
	public static final BitSet FOLLOW_Comma_in_scanfStatement560 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_And_in_scanfStatement562 = new BitSet(new long[]{0x0000002000040000L});
	public static final BitSet FOLLOW_value_in_scanfStatement566 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RightParen_in_scanfStatement570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Semi_in_scanfStatement572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_value590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Constant_in_value601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_synpred10_myInterp235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_Plus_in_synpred10_myInterp237 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred10_myInterp243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_synpred11_myInterp254 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_Minus_in_synpred11_myInterp256 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred11_myInterp262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_synpred12_myInterp273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_Star_in_synpred12_myInterp275 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred12_myInterp281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primaryExpression_in_synpred13_myInterp292 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_Div_in_synpred13_myInterp294 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred13_myInterp300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred16_myInterp411 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_Less_in_synpred16_myInterp413 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred16_myInterp419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred17_myInterp430 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Greater_in_synpred17_myInterp432 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred17_myInterp438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_synpred18_myInterp449 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Equal_in_synpred18_myInterp451 = new BitSet(new long[]{0x0000102000040000L});
	public static final BitSet FOLLOW_expression_in_synpred18_myInterp457 = new BitSet(new long[]{0x0000000000000002L});
}
