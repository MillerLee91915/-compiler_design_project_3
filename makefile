all:
	java -cp ./antlr-3.5.2-complete.jar org.antlr.Tool myInterp.g
	javac -cp ./antlr-3.5.2-complete.jar:. myInterp_test.java
	java -cp ./antlr-3.5.2-complete.jar:. myInterp_test sample1.c 
	java -cp ./antlr-3.5.2-complete.jar:. myInterp_test sample2.c 
	java -cp ./antlr-3.5.2-complete.jar:. myInterp_test sample3.c 
clean:
	rm -f myInterp.tokens myInterpLexer.java myInterparser.java *.class *.txt