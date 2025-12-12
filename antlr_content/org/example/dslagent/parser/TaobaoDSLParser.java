// Generated from D:/IDEA/javadocument/DSLAgent/src/main/antlr/TaobaoDSL.g4 by ANTLR 4.13.2
package org.example.dslagent.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TaobaoDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, INT=42, STRING=43, BOOL=44, ID=45, WS=46, 
		COMMENT=47;
	public static final int
		RULE_program = 0, RULE_productCatalog = 1, RULE_productDefinition = 2, 
		RULE_attribute = 3, RULE_productType = 4, RULE_seasonType = 5, RULE_dialogueScenario = 6, 
		RULE_statement = 7, RULE_varDeclaration = 8, RULE_type = 9, RULE_assignment = 10, 
		RULE_printStatement = 11, RULE_waitStatement = 12, RULE_recommendStatement = 13, 
		RULE_recommendOption = 14, RULE_checkStockStatement = 15, RULE_showCatalogStatement = 16, 
		RULE_intentRule = 17, RULE_expression = 18, RULE_additiveExpression = 19, 
		RULE_multiplicativeExpression = 20, RULE_primaryExpression = 21, RULE_literal = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "productCatalog", "productDefinition", "attribute", "productType", 
			"seasonType", "dialogueScenario", "statement", "varDeclaration", "type", 
			"assignment", "printStatement", "waitStatement", "recommendStatement", 
			"recommendOption", "checkStockStatement", "showCatalogStatement", "intentRule", 
			"expression", "additiveExpression", "multiplicativeExpression", "primaryExpression", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'catalog'", "'{'", "'}'", "'product'", "'type'", "'='", "';'", 
			"'season'", "'price'", "'stock'", "'description'", "'MENS'", "'WOMENS'", 
			"'KIDS'", "'UNISEX'", "'WINTER'", "'SUMMER'", "'ALL_SEASON'", "'scenario'", 
			"'string'", "'int'", "'bool'", "'print'", "'('", "')'", "'wait'", "'recommend'", 
			"','", "'for'", "'maxPrice'", "'checkStock'", "'showCatalog'", "'filter'", 
			"'on'", "'intent'", "'+'", "'-'", "'*'", "'/'", "'getPrice'", "'getStock'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INT", "STRING", "BOOL", "ID", "WS", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TaobaoDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaobaoDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TaobaoDSLParser.EOF, 0); }
		public List<DialogueScenarioContext> dialogueScenario() {
			return getRuleContexts(DialogueScenarioContext.class);
		}
		public DialogueScenarioContext dialogueScenario(int i) {
			return getRuleContext(DialogueScenarioContext.class,i);
		}
		public List<ProductCatalogContext> productCatalog() {
			return getRuleContexts(ProductCatalogContext.class);
		}
		public ProductCatalogContext productCatalog(int i) {
			return getRuleContext(ProductCatalogContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__18) {
				{
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(46);
					dialogueScenario();
					}
					break;
				case T__0:
					{
					setState(47);
					productCatalog();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductCatalogContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public List<ProductDefinitionContext> productDefinition() {
			return getRuleContexts(ProductDefinitionContext.class);
		}
		public ProductDefinitionContext productDefinition(int i) {
			return getRuleContext(ProductDefinitionContext.class,i);
		}
		public ProductCatalogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productCatalog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterProductCatalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitProductCatalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitProductCatalog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductCatalogContext productCatalog() throws RecognitionException {
		ProductCatalogContext _localctx = new ProductCatalogContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_productCatalog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			match(ID);
			setState(57);
			match(T__1);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				productDefinition();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(63);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public ProductDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterProductDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitProductDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitProductDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductDefinitionContext productDefinition() throws RecognitionException {
		ProductDefinitionContext _localctx = new ProductDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_productDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			match(ID);
			setState(67);
			match(T__1);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				attribute();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3872L) != 0) );
			setState(73);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public ProductTypeContext productType() {
			return getRuleContext(ProductTypeContext.class,0);
		}
		public SeasonTypeContext seasonType() {
			return getRuleContext(SeasonTypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(TaobaoDSLParser.INT, 0); }
		public TerminalNode STRING() { return getToken(TaobaoDSLParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(T__4);
				setState(76);
				match(T__5);
				setState(77);
				productType();
				setState(78);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(T__7);
				setState(81);
				match(T__5);
				setState(82);
				seasonType();
				setState(83);
				match(T__6);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(T__8);
				setState(86);
				match(T__5);
				setState(87);
				match(INT);
				setState(88);
				match(T__6);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__9);
				setState(90);
				match(T__5);
				setState(91);
				match(INT);
				setState(92);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(T__10);
				setState(94);
				match(T__5);
				setState(95);
				match(STRING);
				setState(96);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductTypeContext extends ParserRuleContext {
		public ProductTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterProductType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitProductType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitProductType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductTypeContext productType() throws RecognitionException {
		ProductTypeContext _localctx = new ProductTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_productType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeasonTypeContext extends ParserRuleContext {
		public SeasonTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seasonType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterSeasonType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitSeasonType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitSeasonType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeasonTypeContext seasonType() throws RecognitionException {
		SeasonTypeContext _localctx = new SeasonTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_seasonType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DialogueScenarioContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<IntentRuleContext> intentRule() {
			return getRuleContexts(IntentRuleContext.class);
		}
		public IntentRuleContext intentRule(int i) {
			return getRuleContext(IntentRuleContext.class,i);
		}
		public DialogueScenarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialogueScenario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterDialogueScenario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitDialogueScenario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitDialogueScenario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DialogueScenarioContext dialogueScenario() throws RecognitionException {
		DialogueScenarioContext _localctx = new DialogueScenarioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dialogueScenario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__18);
			setState(104);
			match(ID);
			setState(105);
			match(T__1);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35191031595008L) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(112);
				intentRule();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public WaitStatementContext waitStatement() {
			return getRuleContext(WaitStatementContext.class,0);
		}
		public RecommendStatementContext recommendStatement() {
			return getRuleContext(RecommendStatementContext.class,0);
		}
		public CheckStockStatementContext checkStockStatement() {
			return getRuleContext(CheckStockStatementContext.class,0);
		}
		public ShowCatalogStatementContext showCatalogStatement() {
			return getRuleContext(ShowCatalogStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				varDeclaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				assignment();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				printStatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				waitStatement();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				recommendStatement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				checkStockStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(126);
				showCatalogStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			type();
			setState(130);
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(131);
				match(T__5);
				setState(132);
				expression();
				}
			}

			setState(135);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(T__5);
			setState(141);
			expression();
			setState(142);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__22);
			setState(145);
			match(T__23);
			setState(146);
			expression();
			setState(147);
			match(T__24);
			setState(148);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WaitStatementContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TaobaoDSLParser.STRING, 0); }
		public WaitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterWaitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitWaitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitWaitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitStatementContext waitStatement() throws RecognitionException {
		WaitStatementContext _localctx = new WaitStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_waitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__25);
			setState(151);
			match(T__23);
			setState(152);
			match(STRING);
			setState(153);
			match(T__24);
			setState(154);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecommendStatementContext extends ParserRuleContext {
		public List<RecommendOptionContext> recommendOption() {
			return getRuleContexts(RecommendOptionContext.class);
		}
		public RecommendOptionContext recommendOption(int i) {
			return getRuleContext(RecommendOptionContext.class,i);
		}
		public RecommendStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recommendStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterRecommendStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitRecommendStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitRecommendStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecommendStatementContext recommendStatement() throws RecognitionException {
		RecommendStatementContext _localctx = new RecommendStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recommendStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__26);
			setState(157);
			match(T__23);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1610612992L) != 0)) {
				{
				setState(158);
				recommendOption();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__27) {
					{
					{
					setState(159);
					match(T__27);
					setState(160);
					recommendOption();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
			match(T__24);
			setState(169);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecommendOptionContext extends ParserRuleContext {
		public RecommendOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recommendOption; }
	 
		public RecommendOptionContext() { }
		public void copyFrom(RecommendOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecommendMaxPriceContext extends RecommendOptionContext {
		public TerminalNode INT() { return getToken(TaobaoDSLParser.INT, 0); }
		public RecommendMaxPriceContext(RecommendOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterRecommendMaxPrice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitRecommendMaxPrice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitRecommendMaxPrice(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecommendSeasonContext extends RecommendOptionContext {
		public SeasonTypeContext seasonType() {
			return getRuleContext(SeasonTypeContext.class,0);
		}
		public RecommendSeasonContext(RecommendOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterRecommendSeason(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitRecommendSeason(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitRecommendSeason(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecommendForContext extends RecommendOptionContext {
		public TerminalNode STRING() { return getToken(TaobaoDSLParser.STRING, 0); }
		public RecommendForContext(RecommendOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterRecommendFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitRecommendFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitRecommendFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecommendOptionContext recommendOption() throws RecognitionException {
		RecommendOptionContext _localctx = new RecommendOptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_recommendOption);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new RecommendForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__28);
				setState(172);
				match(STRING);
				}
				break;
			case T__7:
				_localctx = new RecommendSeasonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__7);
				setState(174);
				seasonType();
				}
				break;
			case T__29:
				_localctx = new RecommendMaxPriceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__29);
				setState(176);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckStockStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public TerminalNode INT() { return getToken(TaobaoDSLParser.INT, 0); }
		public CheckStockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkStockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterCheckStockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitCheckStockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitCheckStockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckStockStatementContext checkStockStatement() throws RecognitionException {
		CheckStockStatementContext _localctx = new CheckStockStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_checkStockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__30);
			setState(180);
			match(T__23);
			setState(181);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(182);
				match(T__27);
				setState(183);
				match(INT);
				}
			}

			setState(186);
			match(T__24);
			setState(187);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShowCatalogStatementContext extends ParserRuleContext {
		public ProductTypeContext productType() {
			return getRuleContext(ProductTypeContext.class,0);
		}
		public SeasonTypeContext seasonType() {
			return getRuleContext(SeasonTypeContext.class,0);
		}
		public ShowCatalogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showCatalogStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterShowCatalogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitShowCatalogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitShowCatalogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowCatalogStatementContext showCatalogStatement() throws RecognitionException {
		ShowCatalogStatementContext _localctx = new ShowCatalogStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_showCatalogStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__31);
			setState(190);
			match(T__23);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(191);
				match(T__32);
				setState(192);
				match(T__5);
				setState(195);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
					{
					setState(193);
					productType();
					}
					break;
				case T__15:
				case T__16:
				case T__17:
					{
					setState(194);
					seasonType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(199);
			match(T__24);
			setState(200);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntentRuleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TaobaoDSLParser.STRING, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IntentRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intentRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterIntentRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitIntentRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitIntentRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntentRuleContext intentRule() throws RecognitionException {
		IntentRuleContext _localctx = new IntentRuleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_intentRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__33);
			setState(203);
			match(T__34);
			setState(204);
			match(T__23);
			setState(205);
			match(STRING);
			setState(206);
			match(T__24);
			setState(207);
			match(T__1);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35191031595008L) != 0)) {
				{
				{
				setState(208);
				statement();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			additiveExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			multiplicativeExpression();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__35 || _la==T__36) {
				{
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==T__35 || _la==T__36) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(220);
				multiplicativeExpression();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			primaryExpression();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37 || _la==T__38) {
				{
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==T__37 || _la==T__38) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				primaryExpression();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends PrimaryExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetStockExprContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public GetStockExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterGetStockExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitGetStockExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitGetStockExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetPriceExprContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public GetPriceExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterGetPriceExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitGetPriceExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitGetPriceExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends PrimaryExpressionContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public IdExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primaryExpression);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new ParenExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(T__23);
				setState(235);
				expression();
				setState(236);
				match(T__24);
				}
				break;
			case ID:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(ID);
				}
				break;
			case INT:
			case STRING:
			case BOOL:
				_localctx = new LiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				literal();
				}
				break;
			case T__39:
				_localctx = new GetPriceExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(T__39);
				setState(241);
				match(T__23);
				setState(242);
				match(ID);
				setState(243);
				match(T__24);
				}
				break;
			case T__40:
				_localctx = new GetStockExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(T__40);
				setState(245);
				match(T__23);
				setState(246);
				match(ID);
				setState(247);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(TaobaoDSLParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends LiteralContext {
		public TerminalNode INT() { return getToken(TaobaoDSLParser.INT, 0); }
		public IntLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralContext extends LiteralContext {
		public TerminalNode BOOL() { return getToken(TaobaoDSLParser.BOOL, 0); }
		public BoolLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_literal);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(BOOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0005\u00001\b\u0000"+
		"\n\u0000\f\u00004\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001<\b\u0001\u000b\u0001\f\u0001=\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004"+
		"\u0002F\b\u0002\u000b\u0002\f\u0002G\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003b\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006l\b\u0006\n\u0006\f\u0006o\t\u0006\u0001\u0006"+
		"\u0005\u0006r\b\u0006\n\u0006\f\u0006u\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0080\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u0086\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a2\b\r\n\r\f\r\u00a5\t\r"+
		"\u0003\r\u00a7\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b2\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b9"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c4\b\u0010\u0003"+
		"\u0010\u00c6\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00d2\b\u0011\n\u0011\f\u0011\u00d5\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00de\b\u0013\n\u0013\f\u0013\u00e1\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00e6\b\u0014\n\u0014\f\u0014\u00e9\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00f9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00fe\b\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,\u0000\u0005\u0001\u0000\f\u000f\u0001\u0000\u0010\u0012\u0001\u0000"+
		"\u0014\u0016\u0001\u0000$%\u0001\u0000&\'\u0109\u00002\u0001\u0000\u0000"+
		"\u0000\u00027\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006"+
		"a\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\ne\u0001\u0000\u0000"+
		"\u0000\fg\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000"+
		"\u0010\u0081\u0001\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000"+
		"\u0014\u008b\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000\u0000"+
		"\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000"+
		"\u001c\u00b1\u0001\u0000\u0000\u0000\u001e\u00b3\u0001\u0000\u0000\u0000"+
		" \u00bd\u0001\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00d8"+
		"\u0001\u0000\u0000\u0000&\u00da\u0001\u0000\u0000\u0000(\u00e2\u0001\u0000"+
		"\u0000\u0000*\u00f8\u0001\u0000\u0000\u0000,\u00fd\u0001\u0000\u0000\u0000"+
		".1\u0003\f\u0006\u0000/1\u0003\u0002\u0001\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u0000"+
		"78\u0005\u0001\u0000\u000089\u0005-\u0000\u00009;\u0005\u0002\u0000\u0000"+
		":<\u0003\u0004\u0002\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0003\u0000\u0000@\u0003\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0004\u0000\u0000BC\u0005-\u0000\u0000CE\u0005\u0002\u0000\u0000"+
		"DF\u0003\u0006\u0003\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0003\u0000\u0000J\u0005\u0001\u0000\u0000\u0000"+
		"KL\u0005\u0005\u0000\u0000LM\u0005\u0006\u0000\u0000MN\u0003\b\u0004\u0000"+
		"NO\u0005\u0007\u0000\u0000Ob\u0001\u0000\u0000\u0000PQ\u0005\b\u0000\u0000"+
		"QR\u0005\u0006\u0000\u0000RS\u0003\n\u0005\u0000ST\u0005\u0007\u0000\u0000"+
		"Tb\u0001\u0000\u0000\u0000UV\u0005\t\u0000\u0000VW\u0005\u0006\u0000\u0000"+
		"WX\u0005*\u0000\u0000Xb\u0005\u0007\u0000\u0000YZ\u0005\n\u0000\u0000"+
		"Z[\u0005\u0006\u0000\u0000[\\\u0005*\u0000\u0000\\b\u0005\u0007\u0000"+
		"\u0000]^\u0005\u000b\u0000\u0000^_\u0005\u0006\u0000\u0000_`\u0005+\u0000"+
		"\u0000`b\u0005\u0007\u0000\u0000aK\u0001\u0000\u0000\u0000aP\u0001\u0000"+
		"\u0000\u0000aU\u0001\u0000\u0000\u0000aY\u0001\u0000\u0000\u0000a]\u0001"+
		"\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0007\u0000\u0000"+
		"\u0000d\t\u0001\u0000\u0000\u0000ef\u0007\u0001\u0000\u0000f\u000b\u0001"+
		"\u0000\u0000\u0000gh\u0005\u0013\u0000\u0000hi\u0005-\u0000\u0000im\u0005"+
		"\u0002\u0000\u0000jl\u0003\u000e\u0007\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000ns\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0003\"\u0011"+
		"\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0003\u0000\u0000w\r\u0001\u0000\u0000\u0000"+
		"x\u0080\u0003\u0010\b\u0000y\u0080\u0003\u0014\n\u0000z\u0080\u0003\u0016"+
		"\u000b\u0000{\u0080\u0003\u0018\f\u0000|\u0080\u0003\u001a\r\u0000}\u0080"+
		"\u0003\u001e\u000f\u0000~\u0080\u0003 \u0010\u0000\u007fx\u0001\u0000"+
		"\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000\u0000"+
		"\u007f{\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f}"+
		"\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0003\u0012\t\u0000\u0082\u0085\u0005-"+
		"\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0086\u0003$\u0012"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000"+
		"\u0000\u0088\u0011\u0001\u0000\u0000\u0000\u0089\u008a\u0007\u0002\u0000"+
		"\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u008c\u0005-\u0000\u0000"+
		"\u008c\u008d\u0005\u0006\u0000\u0000\u008d\u008e\u0003$\u0012\u0000\u008e"+
		"\u008f\u0005\u0007\u0000\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u0017\u0000\u0000\u0091\u0092\u0005\u0018\u0000\u0000\u0092"+
		"\u0093\u0003$\u0012\u0000\u0093\u0094\u0005\u0019\u0000\u0000\u0094\u0095"+
		"\u0005\u0007\u0000\u0000\u0095\u0017\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005\u001a\u0000\u0000\u0097\u0098\u0005\u0018\u0000\u0000\u0098\u0099"+
		"\u0005+\u0000\u0000\u0099\u009a\u0005\u0019\u0000\u0000\u009a\u009b\u0005"+
		"\u0007\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005"+
		"\u001b\u0000\u0000\u009d\u00a6\u0005\u0018\u0000\u0000\u009e\u00a3\u0003"+
		"\u001c\u000e\u0000\u009f\u00a0\u0005\u001c\u0000\u0000\u00a0\u00a2\u0003"+
		"\u001c\u000e\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0019\u0000\u0000\u00a9\u00aa\u0005\u0007\u0000\u0000\u00aa\u001b\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0005\u001d\u0000\u0000\u00ac\u00b2\u0005"+
		"+\u0000\u0000\u00ad\u00ae\u0005\b\u0000\u0000\u00ae\u00b2\u0003\n\u0005"+
		"\u0000\u00af\u00b0\u0005\u001e\u0000\u0000\u00b0\u00b2\u0005*\u0000\u0000"+
		"\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u001d\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\u001f\u0000\u0000\u00b4\u00b5\u0005\u0018\u0000\u0000"+
		"\u00b5\u00b8\u0005-\u0000\u0000\u00b6\u00b7\u0005\u001c\u0000\u0000\u00b7"+
		"\u00b9\u0005*\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0019\u0000\u0000\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc\u001f"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0005 \u0000\u0000\u00be\u00c5\u0005"+
		"\u0018\u0000\u0000\u00bf\u00c0\u0005!\u0000\u0000\u00c0\u00c3\u0005\u0006"+
		"\u0000\u0000\u00c1\u00c4\u0003\b\u0004\u0000\u00c2\u00c4\u0003\n\u0005"+
		"\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0019\u0000\u0000\u00c8\u00c9\u0005\u0007\u0000"+
		"\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\"\u0000\u0000"+
		"\u00cb\u00cc\u0005#\u0000\u0000\u00cc\u00cd\u0005\u0018\u0000\u0000\u00cd"+
		"\u00ce\u0005+\u0000\u0000\u00ce\u00cf\u0005\u0019\u0000\u0000\u00cf\u00d3"+
		"\u0005\u0002\u0000\u0000\u00d0\u00d2\u0003\u000e\u0007\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0003\u0000\u0000\u00d7#\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003"+
		"&\u0013\u0000\u00d9%\u0001\u0000\u0000\u0000\u00da\u00df\u0003(\u0014"+
		"\u0000\u00db\u00dc\u0007\u0003\u0000\u0000\u00dc\u00de\u0003(\u0014\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000"+
		"\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\'\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e7\u0003*\u0015\u0000\u00e3\u00e4\u0007\u0004\u0000\u0000\u00e4\u00e6"+
		"\u0003*\u0015\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8)\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u0018\u0000\u0000\u00eb\u00ec\u0003$\u0012"+
		"\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000\u00ed\u00f9\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f9\u0005-\u0000\u0000\u00ef\u00f9\u0003,\u0016\u0000\u00f0"+
		"\u00f1\u0005(\u0000\u0000\u00f1\u00f2\u0005\u0018\u0000\u0000\u00f2\u00f3"+
		"\u0005-\u0000\u0000\u00f3\u00f9\u0005\u0019\u0000\u0000\u00f4\u00f5\u0005"+
		")\u0000\u0000\u00f5\u00f6\u0005\u0018\u0000\u0000\u00f6\u00f7\u0005-\u0000"+
		"\u0000\u00f7\u00f9\u0005\u0019\u0000\u0000\u00f8\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f8\u00ee\u0001\u0000\u0000\u0000\u00f8\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f9+\u0001\u0000\u0000\u0000\u00fa\u00fe\u0005*\u0000\u0000\u00fb"+
		"\u00fe\u0005+\u0000\u0000\u00fc\u00fe\u0005,\u0000\u0000\u00fd\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fe-\u0001\u0000\u0000\u0000\u001402=Gams\u007f\u0085"+
		"\u00a3\u00a6\u00b1\u00b8\u00c3\u00c5\u00d3\u00df\u00e7\u00f8\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}