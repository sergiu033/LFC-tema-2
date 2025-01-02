// Generated from d:/facultate/anul2/anul2sem1/LFC/proiect2v3/Proiect2LFC/Proiect2LFC/MiniLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLangParser}.
 */
public interface MiniLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStmt(MiniLangParser.DeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStmt(MiniLangParser.DeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(MiniLangParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(MiniLangParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MiniLangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MiniLangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(MiniLangParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(MiniLangParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(MiniLangParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(MiniLangParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(MiniLangParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(MiniLangParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MiniLangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link MiniLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MiniLangParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MiniLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MiniLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumericAtomExp(MiniLangParser.NumericAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericAtomExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumericAtomExp(MiniLangParser.NumericAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtomExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringAtomExp(MiniLangParser.StringAtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtomExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringAtomExp(MiniLangParser.StringAtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExp(MiniLangParser.FunctionCallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExp(MiniLangParser.FunctionCallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExp(MiniLangParser.MulDivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExp(MiniLangParser.MulDivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(MiniLangParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(MiniLangParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementDecrementExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrementDecrementExp(MiniLangParser.IncrementDecrementExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementDecrementExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrementDecrementExp(MiniLangParser.IncrementDecrementExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExp(MiniLangParser.RelationalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExp(MiniLangParser.RelationalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExp(MiniLangParser.AssignmentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExp(MiniLangParser.AssignmentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExp(MiniLangParser.LogicalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExp(MiniLangParser.LogicalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(MiniLangParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(MiniLangParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExp(MiniLangParser.AddSubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExp}
	 * labeled alternative in {@link MiniLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExp(MiniLangParser.AddSubExpContext ctx);
}