// Generated from D:/IDEA/javadocument/DSLAgent/src/main/antlr/TaobaoDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaobaoDSLParser}.
 */
public interface TaobaoDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TaobaoDSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TaobaoDSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#dialogueScenario}.
	 * @param ctx the parse tree
	 */
	void enterDialogueScenario(TaobaoDSLParser.DialogueScenarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#dialogueScenario}.
	 * @param ctx the parse tree
	 */
	void exitDialogueScenario(TaobaoDSLParser.DialogueScenarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#scenarioBody}.
	 * @param ctx the parse tree
	 */
	void enterScenarioBody(TaobaoDSLParser.ScenarioBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#scenarioBody}.
	 * @param ctx the parse tree
	 */
	void exitScenarioBody(TaobaoDSLParser.ScenarioBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(TaobaoDSLParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(TaobaoDSLParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(TaobaoDSLParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(TaobaoDSLParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TaobaoDSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TaobaoDSLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(TaobaoDSLParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(TaobaoDSLParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TaobaoDSLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TaobaoDSLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TaobaoDSLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TaobaoDSLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TaobaoDSLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TaobaoDSLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TaobaoDSLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TaobaoDSLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(TaobaoDSLParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(TaobaoDSLParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TaobaoDSLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TaobaoDSLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(TaobaoDSLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(TaobaoDSLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(TaobaoDSLParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(TaobaoDSLParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(TaobaoDSLParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(TaobaoDSLParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TaobaoDSLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TaobaoDSLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(TaobaoDSLParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(TaobaoDSLParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void enterWaitStatement(TaobaoDSLParser.WaitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#waitStatement}.
	 * @param ctx the parse tree
	 */
	void exitWaitStatement(TaobaoDSLParser.WaitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(TaobaoDSLParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(TaobaoDSLParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#llmCall}.
	 * @param ctx the parse tree
	 */
	void enterLlmCall(TaobaoDSLParser.LlmCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#llmCall}.
	 * @param ctx the parse tree
	 */
	void exitLlmCall(TaobaoDSLParser.LlmCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#databaseQuery}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseQuery(TaobaoDSLParser.DatabaseQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#databaseQuery}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseQuery(TaobaoDSLParser.DatabaseQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#intentRule}.
	 * @param ctx the parse tree
	 */
	void enterIntentRule(TaobaoDSLParser.IntentRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#intentRule}.
	 * @param ctx the parse tree
	 */
	void exitIntentRule(TaobaoDSLParser.IntentRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#responseRule}.
	 * @param ctx the parse tree
	 */
	void enterResponseRule(TaobaoDSLParser.ResponseRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#responseRule}.
	 * @param ctx the parse tree
	 */
	void exitResponseRule(TaobaoDSLParser.ResponseRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#transition}.
	 * @param ctx the parse tree
	 */
	void enterTransition(TaobaoDSLParser.TransitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#transition}.
	 * @param ctx the parse tree
	 */
	void exitTransition(TaobaoDSLParser.TransitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccess(TaobaoDSLParser.MemberAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberAccess}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccess(TaobaoDSLParser.MemberAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(TaobaoDSLParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(TaobaoDSLParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(TaobaoDSLParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(TaobaoDSLParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(TaobaoDSLParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(TaobaoDSLParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(TaobaoDSLParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objectExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(TaobaoDSLParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(TaobaoDSLParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(TaobaoDSLParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(TaobaoDSLParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(TaobaoDSLParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(TaobaoDSLParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(TaobaoDSLParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(TaobaoDSLParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(TaobaoDSLParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(TaobaoDSLParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(TaobaoDSLParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(TaobaoDSLParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(TaobaoDSLParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(TaobaoDSLParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(TaobaoDSLParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(TaobaoDSLParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(TaobaoDSLParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(TaobaoDSLParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code floatLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(TaobaoDSLParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(TaobaoDSLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(TaobaoDSLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(TaobaoDSLParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(TaobaoDSLParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(TaobaoDSLParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(TaobaoDSLParser.NullLiteralContext ctx);
}