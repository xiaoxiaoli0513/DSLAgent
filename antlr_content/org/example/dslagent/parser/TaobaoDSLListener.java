// Generated from D:/IDEA/javadocument/DSLAgent/src/main/antlr/TaobaoDSL.g4 by ANTLR 4.13.2
package org.example.dslagent.parser;
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
	 * Enter a parse tree produced by {@link TaobaoDSLParser#productCatalog}.
	 * @param ctx the parse tree
	 */
	void enterProductCatalog(TaobaoDSLParser.ProductCatalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#productCatalog}.
	 * @param ctx the parse tree
	 */
	void exitProductCatalog(TaobaoDSLParser.ProductCatalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#productDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProductDefinition(TaobaoDSLParser.ProductDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#productDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProductDefinition(TaobaoDSLParser.ProductDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(TaobaoDSLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(TaobaoDSLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#productType}.
	 * @param ctx the parse tree
	 */
	void enterProductType(TaobaoDSLParser.ProductTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#productType}.
	 * @param ctx the parse tree
	 */
	void exitProductType(TaobaoDSLParser.ProductTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#seasonType}.
	 * @param ctx the parse tree
	 */
	void enterSeasonType(TaobaoDSLParser.SeasonTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#seasonType}.
	 * @param ctx the parse tree
	 */
	void exitSeasonType(TaobaoDSLParser.SeasonTypeContext ctx);
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
	 * Enter a parse tree produced by {@link TaobaoDSLParser#recommendStatement}.
	 * @param ctx the parse tree
	 */
	void enterRecommendStatement(TaobaoDSLParser.RecommendStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#recommendStatement}.
	 * @param ctx the parse tree
	 */
	void exitRecommendStatement(TaobaoDSLParser.RecommendStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#checkStockStatement}.
	 * @param ctx the parse tree
	 */
	void enterCheckStockStatement(TaobaoDSLParser.CheckStockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#checkStockStatement}.
	 * @param ctx the parse tree
	 */
	void exitCheckStockStatement(TaobaoDSLParser.CheckStockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaobaoDSLParser#showCatalogStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCatalogStatement(TaobaoDSLParser.ShowCatalogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaobaoDSLParser#showCatalogStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCatalogStatement(TaobaoDSLParser.ShowCatalogStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code getStockExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGetStockExpr(TaobaoDSLParser.GetStockExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getStockExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGetStockExpr(TaobaoDSLParser.GetStockExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getPriceExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGetPriceExpr(TaobaoDSLParser.GetPriceExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getPriceExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGetPriceExpr(TaobaoDSLParser.GetPriceExprContext ctx);
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
}