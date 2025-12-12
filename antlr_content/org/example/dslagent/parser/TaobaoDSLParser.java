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
		RULE_checkStockStatement = 14, RULE_showCatalogStatement = 15, RULE_intentRule = 16, 
		RULE_expression = 17, RULE_literal = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "productCatalog", "productDefinition", "attribute", "productType", 
			"seasonType", "dialogueScenario", "statement", "varDeclaration", "type", 
			"assignment", "printStatement", "waitStatement", "recommendStatement", 
			"checkStockStatement", "showCatalogStatement", "intentRule", "expression", 
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
			"'for'", "','", "'maxPrice'", "'checkStock'", "'showCatalog'", "'filter'", 
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__18) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
					{
					setState(38);
					dialogueScenario();
					}
					break;
				case T__0:
					{
					setState(39);
					productCatalog();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(49);
			match(T__1);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				productDefinition();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(55);
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
			setState(57);
			match(T__3);
			setState(58);
			match(ID);
			setState(59);
			match(T__1);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				attribute();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 3872L) != 0) );
			setState(65);
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
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__4);
				setState(68);
				match(T__5);
				setState(69);
				productType();
				setState(70);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__7);
				setState(73);
				match(T__5);
				setState(74);
				seasonType();
				setState(75);
				match(T__6);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(T__8);
				setState(78);
				match(T__5);
				setState(79);
				match(INT);
				setState(80);
				match(T__6);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				match(T__9);
				setState(82);
				match(T__5);
				setState(83);
				match(INT);
				setState(84);
				match(T__6);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(T__10);
				setState(86);
				match(T__5);
				setState(87);
				match(STRING);
				setState(88);
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
			setState(91);
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
			setState(93);
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
			setState(95);
			match(T__18);
			setState(96);
			match(ID);
			setState(97);
			match(T__1);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35191031595008L) != 0)) {
				{
				{
				setState(98);
				statement();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__33) {
				{
				{
				setState(104);
				intentRule();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				varDeclaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				assignment();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				printStatement();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				waitStatement();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				recommendStatement();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				checkStockStatement();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
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
			setState(121);
			type();
			setState(122);
			match(ID);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(123);
				match(T__5);
				setState(124);
				expression(0);
				}
			}

			setState(127);
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
			setState(129);
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
			setState(131);
			match(ID);
			setState(132);
			match(T__5);
			setState(133);
			expression(0);
			setState(134);
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
			setState(136);
			match(T__22);
			setState(137);
			match(T__23);
			setState(138);
			expression(0);
			setState(139);
			match(T__24);
			setState(140);
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
			setState(142);
			match(T__25);
			setState(143);
			match(T__23);
			setState(144);
			match(STRING);
			setState(145);
			match(T__24);
			setState(146);
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
		public TerminalNode STRING() { return getToken(TaobaoDSLParser.STRING, 0); }
		public SeasonTypeContext seasonType() {
			return getRuleContext(SeasonTypeContext.class,0);
		}
		public TerminalNode INT() { return getToken(TaobaoDSLParser.INT, 0); }
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
			setState(148);
			match(T__26);
			setState(149);
			match(T__23);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(150);
				match(T__27);
				setState(151);
				match(STRING);
				}
			}

			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(154);
				match(T__28);
				setState(155);
				match(T__7);
				setState(156);
				seasonType();
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(159);
				match(T__28);
				setState(160);
				match(T__29);
				setState(161);
				match(INT);
				}
			}

			setState(164);
			match(T__24);
			setState(165);
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
		enterRule(_localctx, 28, RULE_checkStockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__30);
			setState(168);
			match(T__23);
			setState(169);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(170);
				match(T__28);
				setState(171);
				match(INT);
				}
			}

			setState(174);
			match(T__24);
			setState(175);
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
		enterRule(_localctx, 30, RULE_showCatalogStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__31);
			setState(178);
			match(T__23);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(179);
				match(T__32);
				setState(180);
				match(T__5);
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
				case T__12:
				case T__13:
				case T__14:
					{
					setState(181);
					productType();
					}
					break;
				case T__15:
				case T__16:
				case T__17:
					{
					setState(182);
					seasonType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(187);
			match(T__24);
			setState(188);
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
		enterRule(_localctx, 32, RULE_intentRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__33);
			setState(191);
			match(T__34);
			setState(192);
			match(T__23);
			setState(193);
			match(STRING);
			setState(194);
			match(T__24);
			setState(195);
			match(T__1);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35191031595008L) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class GetStockExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public GetStockExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class GetPriceExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public GetPriceExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class MulDivExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulDivExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).enterMulDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaobaoDSLListener ) ((TaobaoDSLListener)listener).exitMulDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaobaoDSLVisitor ) return ((TaobaoDSLVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class IdExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(TaobaoDSLParser.ID, 0); }
		public IdExprContext(ExpressionContext ctx) { copyFrom(ctx); }
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(205);
				match(T__23);
				setState(206);
				expression(0);
				setState(207);
				match(T__24);
				}
				break;
			case ID:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(ID);
				}
				break;
			case INT:
			case STRING:
			case BOOL:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				literal();
				}
				break;
			case T__39:
				{
				_localctx = new GetPriceExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				match(T__39);
				setState(212);
				match(T__23);
				setState(213);
				match(ID);
				setState(214);
				match(T__24);
				}
				break;
			case T__40:
				{
				_localctx = new GetStockExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(T__40);
				setState(216);
				match(T__23);
				setState(217);
				match(ID);
				setState(218);
				match(T__24);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(222);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new MulDivExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(225);
						((MulDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((MulDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(226);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(STRING);
				}
				break;
			case BOOL:
				_localctx = new BoolLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u00014\b\u0001\u000b\u0001\f\u00015\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002>\b\u0002\u000b"+
		"\u0002\f\u0002?\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003Z\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006d\b\u0006\n\u0006\f\u0006g\t\u0006\u0001\u0006\u0005\u0006j\b\u0006"+
		"\n\u0006\f\u0006m\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"x\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b~\b\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0099\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u009e\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00a3\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ad\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b8\b\u000f\u0003\u000f\u00ba\b"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c6"+
		"\b\u0010\n\u0010\f\u0010\u00c9\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00dc\b\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00e4\b\u0011"+
		"\n\u0011\f\u0011\u00e7\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ec\b\u0012\u0001\u0012\u0000\u0001\"\u0013\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$\u0000\u0005\u0001\u0000\f\u000f\u0001\u0000\u0010\u0012\u0001\u0000"+
		"\u0014\u0016\u0001\u0000$%\u0001\u0000&\'\u00fa\u0000*\u0001\u0000\u0000"+
		"\u0000\u0002/\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006"+
		"Y\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\n]\u0001\u0000\u0000"+
		"\u0000\f_\u0001\u0000\u0000\u0000\u000ew\u0001\u0000\u0000\u0000\u0010"+
		"y\u0001\u0000\u0000\u0000\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0083"+
		"\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000\u0018\u008e"+
		"\u0001\u0000\u0000\u0000\u001a\u0094\u0001\u0000\u0000\u0000\u001c\u00a7"+
		"\u0001\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00be\u0001"+
		"\u0000\u0000\u0000\"\u00db\u0001\u0000\u0000\u0000$\u00eb\u0001\u0000"+
		"\u0000\u0000&)\u0003\f\u0006\u0000\')\u0003\u0002\u0001\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0001\u0001"+
		"\u0000\u0000\u0000/0\u0005\u0001\u0000\u000001\u0005-\u0000\u000013\u0005"+
		"\u0002\u0000\u000024\u0003\u0004\u0002\u000032\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000067\u0001\u0000\u0000\u000078\u0005\u0003\u0000\u00008\u0003\u0001"+
		"\u0000\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0005-\u0000\u0000;=\u0005"+
		"\u0002\u0000\u0000<>\u0003\u0006\u0003\u0000=<\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u0003\u0000\u0000B\u0005\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0005\u0006\u0000\u0000"+
		"EF\u0003\b\u0004\u0000FG\u0005\u0007\u0000\u0000GZ\u0001\u0000\u0000\u0000"+
		"HI\u0005\b\u0000\u0000IJ\u0005\u0006\u0000\u0000JK\u0003\n\u0005\u0000"+
		"KL\u0005\u0007\u0000\u0000LZ\u0001\u0000\u0000\u0000MN\u0005\t\u0000\u0000"+
		"NO\u0005\u0006\u0000\u0000OP\u0005*\u0000\u0000PZ\u0005\u0007\u0000\u0000"+
		"QR\u0005\n\u0000\u0000RS\u0005\u0006\u0000\u0000ST\u0005*\u0000\u0000"+
		"TZ\u0005\u0007\u0000\u0000UV\u0005\u000b\u0000\u0000VW\u0005\u0006\u0000"+
		"\u0000WX\u0005+\u0000\u0000XZ\u0005\u0007\u0000\u0000YC\u0001\u0000\u0000"+
		"\u0000YH\u0001\u0000\u0000\u0000YM\u0001\u0000\u0000\u0000YQ\u0001\u0000"+
		"\u0000\u0000YU\u0001\u0000\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000"+
		"[\\\u0007\u0000\u0000\u0000\\\t\u0001\u0000\u0000\u0000]^\u0007\u0001"+
		"\u0000\u0000^\u000b\u0001\u0000\u0000\u0000_`\u0005\u0013\u0000\u0000"+
		"`a\u0005-\u0000\u0000ae\u0005\u0002\u0000\u0000bd\u0003\u000e\u0007\u0000"+
		"cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000ef\u0001\u0000\u0000\u0000fk\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000hj\u0003 \u0010\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0003\u0000\u0000"+
		"o\r\u0001\u0000\u0000\u0000px\u0003\u0010\b\u0000qx\u0003\u0014\n\u0000"+
		"rx\u0003\u0016\u000b\u0000sx\u0003\u0018\f\u0000tx\u0003\u001a\r\u0000"+
		"ux\u0003\u001c\u000e\u0000vx\u0003\u001e\u000f\u0000wp\u0001\u0000\u0000"+
		"\u0000wq\u0001\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000ws\u0001\u0000"+
		"\u0000\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001"+
		"\u0000\u0000\u0000x\u000f\u0001\u0000\u0000\u0000yz\u0003\u0012\t\u0000"+
		"z}\u0005-\u0000\u0000{|\u0005\u0006\u0000\u0000|~\u0003\"\u0011\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0007\u0002\u0000\u0000\u0082\u0013\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005-\u0000\u0000\u0084\u0085\u0005\u0006\u0000"+
		"\u0000\u0085\u0086\u0003\"\u0011\u0000\u0086\u0087\u0005\u0007\u0000\u0000"+
		"\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0017\u0000\u0000"+
		"\u0089\u008a\u0005\u0018\u0000\u0000\u008a\u008b\u0003\"\u0011\u0000\u008b"+
		"\u008c\u0005\u0019\u0000\u0000\u008c\u008d\u0005\u0007\u0000\u0000\u008d"+
		"\u0017\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u001a\u0000\u0000\u008f"+
		"\u0090\u0005\u0018\u0000\u0000\u0090\u0091\u0005+\u0000\u0000\u0091\u0092"+
		"\u0005\u0019\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u0019"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u001b\u0000\u0000\u0095\u0098"+
		"\u0005\u0018\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0099"+
		"\u0005+\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009b\u0005"+
		"\u001d\u0000\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u009e\u0003\n"+
		"\u0005\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a2\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001d"+
		"\u0000\u0000\u00a0\u00a1\u0005\u001e\u0000\u0000\u00a1\u00a3\u0005*\u0000"+
		"\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0019\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0007\u0000\u0000\u00a6\u001b\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00a9\u0005\u0018\u0000"+
		"\u0000\u00a9\u00ac\u0005-\u0000\u0000\u00aa\u00ab\u0005\u001d\u0000\u0000"+
		"\u00ab\u00ad\u0005*\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u0019\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0"+
		"\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005 \u0000\u0000\u00b2\u00b9"+
		"\u0005\u0018\u0000\u0000\u00b3\u00b4\u0005!\u0000\u0000\u00b4\u00b7\u0005"+
		"\u0006\u0000\u0000\u00b5\u00b8\u0003\b\u0004\u0000\u00b6\u00b8\u0003\n"+
		"\u0005\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0005\u0019\u0000\u0000\u00bc\u00bd\u0005\u0007"+
		"\u0000\u0000\u00bd\u001f\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\"\u0000"+
		"\u0000\u00bf\u00c0\u0005#\u0000\u0000\u00c0\u00c1\u0005\u0018\u0000\u0000"+
		"\u00c1\u00c2\u0005+\u0000\u0000\u00c2\u00c3\u0005\u0019\u0000\u0000\u00c3"+
		"\u00c7\u0005\u0002\u0000\u0000\u00c4\u00c6\u0003\u000e\u0007\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0003\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0006\u0011\uffff\uffff\u0000\u00cd\u00ce\u0005\u0018\u0000\u0000\u00ce"+
		"\u00cf\u0003\"\u0011\u0000\u00cf\u00d0\u0005\u0019\u0000\u0000\u00d0\u00dc"+
		"\u0001\u0000\u0000\u0000\u00d1\u00dc\u0005-\u0000\u0000\u00d2\u00dc\u0003"+
		"$\u0012\u0000\u00d3\u00d4\u0005(\u0000\u0000\u00d4\u00d5\u0005\u0018\u0000"+
		"\u0000\u00d5\u00d6\u0005-\u0000\u0000\u00d6\u00dc\u0005\u0019\u0000\u0000"+
		"\u00d7\u00d8\u0005)\u0000\u0000\u00d8\u00d9\u0005\u0018\u0000\u0000\u00d9"+
		"\u00da\u0005-\u0000\u0000\u00da\u00dc\u0005\u0019\u0000\u0000\u00db\u00cc"+
		"\u0001\u0000\u0000\u0000\u00db\u00d1\u0001\u0000\u0000\u0000\u00db\u00d2"+
		"\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00d7"+
		"\u0001\u0000\u0000\u0000\u00dc\u00e5\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\n\u0004\u0000\u0000\u00de\u00df\u0007\u0003\u0000\u0000\u00df\u00e4\u0003"+
		"\"\u0011\u0005\u00e0\u00e1\n\u0003\u0000\u0000\u00e1\u00e2\u0007\u0004"+
		"\u0000\u0000\u00e2\u00e4\u0003\"\u0011\u0004\u00e3\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6#\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ec\u0005*\u0000\u0000\u00e9\u00ec\u0005+\u0000\u0000\u00ea\u00ec"+
		"\u0005,\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec%\u0001\u0000"+
		"\u0000\u0000\u0014(*5?Yekw}\u0098\u009d\u00a2\u00ac\u00b7\u00b9\u00c7"+
		"\u00db\u00e3\u00e5\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}