// Generated from /Users/timbo/code/ricky/src/main/antlr4/Ricky.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RickyParser}.
 */
public interface RickyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RickyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RickyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RickyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RickyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RickyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(RickyParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(RickyParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(RickyParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(RickyParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RickyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RickyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RickyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RickyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RickyParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RickyParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(RickyParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(RickyParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RickyParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(RickyParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RickyParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(RickyParser.OperatorContext ctx);
}