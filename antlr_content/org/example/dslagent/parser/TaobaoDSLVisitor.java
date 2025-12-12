// Generated from D:/IDEA/javadocument/DSLAgent/src/main/antlr/TaobaoDSL.g4 by ANTLR 4.13.2
package org.example.dslagent.parser;
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
	 * Visit a parse tree produced by {@link TaobaoDSLParser#productCatalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductCatalog(TaobaoDSLParser.ProductCatalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#productDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductDefinition(TaobaoDSLParser.ProductDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(TaobaoDSLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#productType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductType(TaobaoDSLParser.ProductTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#seasonType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeasonType(TaobaoDSLParser.SeasonTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#dialogueScenario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDialogueScenario(TaobaoDSLParser.DialogueScenarioContext ctx);
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
	 * Visit a parse tree produced by {@link TaobaoDSLParser#recommendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecommendStatement(TaobaoDSLParser.RecommendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#checkStockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStockStatement(TaobaoDSLParser.CheckStockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#showCatalogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCatalogStatement(TaobaoDSLParser.ShowCatalogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaobaoDSLParser#intentRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntentRule(TaobaoDSLParser.IntentRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(TaobaoDSLParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(TaobaoDSLParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getStockExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetStockExpr(TaobaoDSLParser.GetStockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getPriceExpr}
	 * labeled alternative in {@link TaobaoDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetPriceExpr(TaobaoDSLParser.GetPriceExprContext ctx);
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
	 * Visit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link TaobaoDSLParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(TaobaoDSLParser.IntLiteralContext ctx);
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
}