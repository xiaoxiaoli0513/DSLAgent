// Generated from D:/IDEA/javadocument/DSLAgent/src/main/antlr/TaobaoDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaobaoDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaobaoDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TaobaoDSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#dialogueScenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogueScenario(TaobaoDSLParser.DialogueScenarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#scenarioBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScenarioBody(TaobaoDSLParser.ScenarioBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(TaobaoDSLParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(TaobaoDSLParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TaobaoDSLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(TaobaoDSLParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TaobaoDSLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TaobaoDSLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TaobaoDSLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TaobaoDSLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(TaobaoDSLParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TaobaoDSLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(TaobaoDSLParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(TaobaoDSLParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(TaobaoDSLParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TaobaoDSLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(TaobaoDSLParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#waitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitStatement(TaobaoDSLParser.WaitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#gotoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(TaobaoDSLParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#llmCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlmCall(TaobaoDSLParser.LlmCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#databaseQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseQuery(TaobaoDSLParser.DatabaseQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#intentRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntentRule(TaobaoDSLParser.IntentRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#responseRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResponseRule(TaobaoDSLParser.ResponseRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#transition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition(TaobaoDSLParser.TransitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(TaobaoDSLParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(TaobaoDSLParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(TaobaoDSLParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(TaobaoDSLParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(TaobaoDSLParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(TaobaoDSLParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(TaobaoDSLParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(TaobaoDSLParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(TaobaoDSLParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(TaobaoDSLParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(TaobaoDSLParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(TaobaoDSLParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(TaobaoDSLParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(TaobaoDSLParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(TaobaoDSLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(TaobaoDSLParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(TaobaoDSLParser.NullLiteralContext ctx);
}