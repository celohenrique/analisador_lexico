package analisadorLexico;// Generated from D:/Users/mathe/Desktop/analisador_lexico/.idea\minipascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minipascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, AP=14, FP=15, AC=16, FC=17, ACOL=18, 
		FCOL=19, TWODOTS=20, SC=21, C=22, OP=23, RELACAO=24, ID=25, NUMBER=26, 
		DIGITO=27, LETRA=28, INT=29, WS=30, True=31, False=32, RESERVADAS=33;
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_decvariaveis = 2, RULE_decvars = 3, 
		RULE_list_ids = 4, RULE_decrotinas = 5, RULE_decproceds = 6, RULE_formalparams = 7, 
		RULE_paramsession = 8, RULE_tipo = 9, RULE_inteiro = 10, RULE_booleano = 11, 
		RULE_floate = 12, RULE_stringei = 13, RULE_comando = 14, RULE_cmd = 15, 
		RULE_cmdattrib = 16, RULE_cmdproced = 17, RULE_cmdcondic = 18, RULE_cmdrepeat = 19, 
		RULE_cmdREAD = 20, RULE_cmdWRITE = 21, RULE_expr = 22, RULE_termo = 23, 
		RULE_expression = 24, RULE_simpleexpression = 25, RULE_fator = 26, RULE_variavel = 27, 
		RULE_listexpressions = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "bloco", "decvariaveis", "decvars", "list_ids", "decrotinas", 
			"decproceds", "formalparams", "paramsession", "tipo", "inteiro", "booleano", 
			"floate", "stringei", "comando", "cmd", "cmdattrib", "cmdproced", "cmdcondic", 
			"cmdrepeat", "cmdREAD", "cmdWRITE", "expr", "termo", "expression", "simpleexpression", 
			"fator", "variavel", "listexpressions"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'procedure'", "'var'", "'begin'", "'end'", "'if'", 
			"'then'", "'else'", "'while'", "'do'", "'leia'", "'escreva'", "'not'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "':'", "';'", "','", null, 
			null, null, null, null, null, "'INT'", null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "AP", "FP", "AC", "FC", "ACOL", "FCOL", "TWODOTS", "SC", 
			"C", "OP", "RELACAO", "ID", "NUMBER", "DIGITO", "LETRA", "INT", "WS", 
			"True", "False", "RESERVADAS"
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
	public String getGrammarFileName() { return "minipascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minipascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			match(ID);
			setState(60);
			match(SC);
			setState(61);
			bloco();
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

	public static class BlocoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode ACOL() { return getToken(minipascalParser.ACOL, 0); }
		public TerminalNode FCOL() { return getToken(minipascalParser.FCOL, 0); }
		public DecvariaveisContext decvariaveis() {
			return getRuleContext(DecvariaveisContext.class,0);
		}
		public DecrotinasContext decrotinas() {
			return getRuleContext(DecrotinasContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(63);
				comando();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(ACOL);
				{
				setState(65);
				decvariaveis();
				}
				setState(66);
				match(FCOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(ACOL);
				{
				setState(69);
				decrotinas();
				}
				setState(70);
				match(FCOL);
				}
				break;
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

	public static class DecvariaveisContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(minipascalParser.AC, 0); }
		public List<TerminalNode> SC() { return getTokens(minipascalParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(minipascalParser.SC, i);
		}
		public DecvarsContext decvars() {
			return getRuleContext(DecvarsContext.class,0);
		}
		public TerminalNode FC() { return getToken(minipascalParser.FC, 0); }
		public DecvariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterDecvariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitDecvariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitDecvariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecvariaveisContext decvariaveis() throws RecognitionException {
		DecvariaveisContext _localctx = new DecvariaveisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decvariaveis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(AC);
			setState(75);
			match(SC);
			setState(76);
			decvars();
			setState(77);
			match(FC);
			setState(78);
			match(SC);
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

	public static class DecvarsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public DecvarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decvars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterDecvars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitDecvars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitDecvars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecvarsContext decvars() throws RecognitionException {
		DecvarsContext _localctx = new DecvarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decvars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			tipo();
			setState(81);
			list_ids();
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

	public static class List_idsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(minipascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(minipascalParser.ID, i);
		}
		public TerminalNode C() { return getToken(minipascalParser.C, 0); }
		public TerminalNode AC() { return getToken(minipascalParser.AC, 0); }
		public List<TerminalNode> FC() { return getTokens(minipascalParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(minipascalParser.FC, i);
		}
		public List_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterList_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitList_ids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitList_ids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_idsContext list_ids() throws RecognitionException {
		List_idsContext _localctx = new List_idsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_ids);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(ID);
			setState(84);
			match(C);
			setState(85);
			match(AC);
			{
			setState(86);
			match(ID);
			}
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					match(FC);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class DecrotinasContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(minipascalParser.AC, 0); }
		public DecprocedsContext decproceds() {
			return getRuleContext(DecprocedsContext.class,0);
		}
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public TerminalNode FC() { return getToken(minipascalParser.FC, 0); }
		public DecrotinasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrotinas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterDecrotinas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitDecrotinas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitDecrotinas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrotinasContext decrotinas() throws RecognitionException {
		DecrotinasContext _localctx = new DecrotinasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decrotinas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(AC);
			setState(94);
			decproceds();
			setState(95);
			match(SC);
			setState(96);
			match(FC);
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

	public static class DecprocedsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public FormalparamsContext formalparams() {
			return getRuleContext(FormalparamsContext.class,0);
		}
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public DecprocedsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproceds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterDecproceds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitDecproceds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitDecproceds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecprocedsContext decproceds() throws RecognitionException {
		DecprocedsContext _localctx = new DecprocedsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decproceds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__1);
			setState(99);
			tipo();
			setState(100);
			formalparams();
			setState(101);
			match(SC);
			setState(102);
			bloco();
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

	public static class FormalparamsContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(minipascalParser.AP, 0); }
		public List<ParamsessionContext> paramsession() {
			return getRuleContexts(ParamsessionContext.class);
		}
		public ParamsessionContext paramsession(int i) {
			return getRuleContext(ParamsessionContext.class,i);
		}
		public TerminalNode AC() { return getToken(minipascalParser.AC, 0); }
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public TerminalNode FC() { return getToken(minipascalParser.FC, 0); }
		public TerminalNode FP() { return getToken(minipascalParser.FP, 0); }
		public FormalparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterFormalparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitFormalparams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitFormalparams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalparamsContext formalparams() throws RecognitionException {
		FormalparamsContext _localctx = new FormalparamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(AP);
			setState(105);
			paramsession();
			setState(106);
			match(AC);
			setState(107);
			match(SC);
			setState(108);
			paramsession();
			setState(109);
			match(FC);
			setState(110);
			match(FP);
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

	public static class ParamsessionContext extends ParserRuleContext {
		public TerminalNode ACOL() { return getToken(minipascalParser.ACOL, 0); }
		public TerminalNode FCOL() { return getToken(minipascalParser.FCOL, 0); }
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public TerminalNode TWODOTS() { return getToken(minipascalParser.TWODOTS, 0); }
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public ParamsessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterParamsession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitParamsession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitParamsession(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsessionContext paramsession() throws RecognitionException {
		ParamsessionContext _localctx = new ParamsessionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramsession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ACOL);
			setState(113);
			match(T__2);
			setState(114);
			match(FCOL);
			setState(115);
			list_ids();
			setState(116);
			match(TWODOTS);
			setState(117);
			match(ID);
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

	public static class TipoContext extends ParserRuleContext {
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public FloateContext floate() {
			return getRuleContext(FloateContext.class,0);
		}
		public StringeiContext stringei() {
			return getRuleContext(StringeiContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGITO:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				inteiro();
				}
				break;
			case True:
			case False:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				booleano();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				floate();
				}
				break;
			case LETRA:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				stringei();
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

	public static class InteiroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(minipascalParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(minipascalParser.DIGITO, i);
		}
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inteiro);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(125);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(130);
			match(DIGITO);
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

	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(minipascalParser.True, 0); }
		public TerminalNode False() { return getToken(minipascalParser.False, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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

	public static class FloateContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(minipascalParser.NUMBER, 0); }
		public FloateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterFloate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitFloate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitFloate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloateContext floate() throws RecognitionException {
		FloateContext _localctx = new FloateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_floate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(NUMBER);
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

	public static class StringeiContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(minipascalParser.LETRA, 0); }
		public StringeiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringei; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterStringei(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitStringei(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitStringei(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringeiContext stringei() throws RecognitionException {
		StringeiContext _localctx = new StringeiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringei);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LETRA);
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

	public static class ComandoContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__3);
			{
			setState(139);
			cmd();
			}
			setState(140);
			match(T__4);
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

	public static class CmdContext extends ParserRuleContext {
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdprocedContext cmdproced() {
			return getRuleContext(CmdprocedContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CmdcondicContext cmdcondic() {
			return getRuleContext(CmdcondicContext.class,0);
		}
		public CmdrepeatContext cmdrepeat() {
			return getRuleContext(CmdrepeatContext.class,0);
		}
		public CmdREADContext cmdREAD() {
			return getRuleContext(CmdREADContext.class,0);
		}
		public CmdWRITEContext cmdWRITE() {
			return getRuleContext(CmdWRITEContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmd);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				cmdattrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				cmdproced();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				comando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				cmdcondic();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				cmdrepeat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				cmdREAD();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				cmdWRITE();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
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

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode RELACAO() { return getToken(minipascalParser.RELACAO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmdattrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmdattrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(RELACAO);
			setState(154);
			expr();
			setState(155);
			match(SC);
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

	public static class CmdprocedContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CmdprocedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdproced; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmdproced(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmdproced(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmdproced(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdprocedContext cmdproced() throws RecognitionException {
		CmdprocedContext _localctx = new CmdprocedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdproced);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ID);
			setState(158);
			expression();
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

	public static class CmdcondicContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public CmdcondicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdcondic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmdcondic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmdcondic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmdcondic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdcondicContext cmdcondic() throws RecognitionException {
		CmdcondicContext _localctx = new CmdcondicContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdcondic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__5);
			setState(161);
			expression();
			setState(162);
			match(T__6);
			setState(163);
			comando();
			setState(164);
			match(T__7);
			setState(165);
			comando();
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

	public static class CmdrepeatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public CmdrepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdrepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmdrepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmdrepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmdrepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdrepeatContext cmdrepeat() throws RecognitionException {
		CmdrepeatContext _localctx = new CmdrepeatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdrepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__8);
			setState(168);
			expression();
			setState(169);
			match(T__9);
			setState(170);
			comando();
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

	public static class CmdREADContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(minipascalParser.AP, 0); }
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode FP() { return getToken(minipascalParser.FP, 0); }
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public CmdREADContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdREAD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmdREAD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmdREAD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmdREAD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdREADContext cmdREAD() throws RecognitionException {
		CmdREADContext _localctx = new CmdREADContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdREAD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__10);
			setState(173);
			match(AP);
			setState(174);
			match(ID);
			setState(175);
			match(FP);
			setState(176);
			match(SC);
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

	public static class CmdWRITEContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(minipascalParser.AP, 0); }
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode FP() { return getToken(minipascalParser.FP, 0); }
		public TerminalNode SC() { return getToken(minipascalParser.SC, 0); }
		public CmdWRITEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWRITE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterCmdWRITE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitCmdWRITE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitCmdWRITE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdWRITEContext cmdWRITE() throws RecognitionException {
		CmdWRITEContext _localctx = new CmdWRITEContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdWRITE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__11);
			setState(179);
			match(AP);
			setState(180);
			match(ID);
			setState(181);
			match(FP);
			setState(182);
			match(SC);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(minipascalParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(minipascalParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			termo();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(185);
				match(OP);
				setState(186);
				termo();
				}
				}
				setState(191);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(minipascalParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleexpressionContext> simpleexpression() {
			return getRuleContexts(SimpleexpressionContext.class);
		}
		public SimpleexpressionContext simpleexpression(int i) {
			return getRuleContext(SimpleexpressionContext.class,i);
		}
		public TerminalNode ACOL() { return getToken(minipascalParser.ACOL, 0); }
		public TerminalNode RELACAO() { return getToken(minipascalParser.RELACAO, 0); }
		public TerminalNode FCOL() { return getToken(minipascalParser.FCOL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			simpleexpression();
			setState(195);
			match(ACOL);
			setState(196);
			match(RELACAO);
			setState(197);
			simpleexpression();
			setState(198);
			match(FCOL);
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

	public static class SimpleexpressionContext extends ParserRuleContext {
		public SimpleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterSimpleexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitSimpleexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitSimpleexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleexpressionContext simpleexpression() throws RecognitionException {
		SimpleexpressionContext _localctx = new SimpleexpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simpleexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class FatorContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(minipascalParser.NUMBER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fator);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				variavel();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(NUMBER);
				}
				break;
			case ACOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				expression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(T__12);
				setState(206);
				fator();
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipascalParser.ID, 0); }
		public TerminalNode ACOL() { return getToken(minipascalParser.ACOL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FCOL() { return getToken(minipascalParser.FCOL, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variavel);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ID);
				setState(211);
				match(ACOL);
				setState(212);
				expression();
				setState(213);
				match(FCOL);
				}
				break;
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

	public static class ListexpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AC() { return getToken(minipascalParser.AC, 0); }
		public TerminalNode C() { return getToken(minipascalParser.C, 0); }
		public TerminalNode FC() { return getToken(minipascalParser.FC, 0); }
		public ListexpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listexpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).enterListexpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipascalListener ) ((minipascalListener)listener).exitListexpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minipascalVisitor) return ((minipascalVisitor<? extends T>)visitor).visitListexpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListexpressionsContext listexpressions() throws RecognitionException {
		ListexpressionsContext _localctx = new ListexpressionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_listexpressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expression();
			setState(218);
			match(AC);
			setState(219);
			match(C);
			setState(220);
			expression();
			setState(221);
			match(FC);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00e2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13~\n\13\3\f\6\f\u0081\n\f"+
		"\r\f\16\f\u0082\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0099\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\7\30\u00be\n\30\f\30\16\30\u00c1\13\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00d2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00da\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\4\3\2!\"\3\2\33\34\2\u00d7\2<\3\2\2\2\4J\3\2"+
		"\2\2\6L\3\2\2\2\bR\3\2\2\2\nU\3\2\2\2\f_\3\2\2\2\16d\3\2\2\2\20j\3\2\2"+
		"\2\22r\3\2\2\2\24}\3\2\2\2\26\u0080\3\2\2\2\30\u0086\3\2\2\2\32\u0088"+
		"\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u0098\3\2\2\2\"\u009a\3\2"+
		"\2\2$\u009f\3\2\2\2&\u00a2\3\2\2\2(\u00a9\3\2\2\2*\u00ae\3\2\2\2,\u00b4"+
		"\3\2\2\2.\u00ba\3\2\2\2\60\u00c2\3\2\2\2\62\u00c4\3\2\2\2\64\u00ca\3\2"+
		"\2\2\66\u00d1\3\2\2\28\u00d9\3\2\2\2:\u00db\3\2\2\2<=\7\3\2\2=>\7\33\2"+
		"\2>?\7\27\2\2?@\5\4\3\2@\3\3\2\2\2AK\5\36\20\2BC\7\24\2\2CD\5\6\4\2DE"+
		"\7\25\2\2EK\3\2\2\2FG\7\24\2\2GH\5\f\7\2HI\7\25\2\2IK\3\2\2\2JA\3\2\2"+
		"\2JB\3\2\2\2JF\3\2\2\2K\5\3\2\2\2LM\7\22\2\2MN\7\27\2\2NO\5\b\5\2OP\7"+
		"\23\2\2PQ\7\27\2\2Q\7\3\2\2\2RS\5\24\13\2ST\5\n\6\2T\t\3\2\2\2UV\7\33"+
		"\2\2VW\7\30\2\2WX\7\22\2\2X\\\7\33\2\2Y[\7\23\2\2ZY\3\2\2\2[^\3\2\2\2"+
		"\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2_`\7\22\2\2`a\5\16\b\2ab"+
		"\7\27\2\2bc\7\23\2\2c\r\3\2\2\2de\7\4\2\2ef\5\24\13\2fg\5\20\t\2gh\7\27"+
		"\2\2hi\5\4\3\2i\17\3\2\2\2jk\7\20\2\2kl\5\22\n\2lm\7\22\2\2mn\7\27\2\2"+
		"no\5\22\n\2op\7\23\2\2pq\7\21\2\2q\21\3\2\2\2rs\7\24\2\2st\7\5\2\2tu\7"+
		"\25\2\2uv\5\n\6\2vw\7\26\2\2wx\7\33\2\2x\23\3\2\2\2y~\5\26\f\2z~\5\30"+
		"\r\2{~\5\32\16\2|~\5\34\17\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~"+
		"\25\3\2\2\2\177\u0081\7\35\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\35"+
		"\2\2\u0085\27\3\2\2\2\u0086\u0087\t\2\2\2\u0087\31\3\2\2\2\u0088\u0089"+
		"\7\34\2\2\u0089\33\3\2\2\2\u008a\u008b\7\36\2\2\u008b\35\3\2\2\2\u008c"+
		"\u008d\7\6\2\2\u008d\u008e\5 \21\2\u008e\u008f\7\7\2\2\u008f\37\3\2\2"+
		"\2\u0090\u0099\5\"\22\2\u0091\u0099\5$\23\2\u0092\u0099\5\36\20\2\u0093"+
		"\u0099\5&\24\2\u0094\u0099\5(\25\2\u0095\u0099\5*\26\2\u0096\u0099\5,"+
		"\27\2\u0097\u0099\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0091\3\2\2\2\u0098"+
		"\u0092\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099!\3\2\2\2\u009a\u009b"+
		"\7\33\2\2\u009b\u009c\7\32\2\2\u009c\u009d\5.\30\2\u009d\u009e\7\27\2"+
		"\2\u009e#\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5\62\32\2\u00a1%\3"+
		"\2\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5\62\32\2\u00a4\u00a5\7\t\2\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\5\36\20\2\u00a8\'\3\2"+
		"\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ab\5\62\32\2\u00ab\u00ac\7\f\2\2\u00ac"+
		"\u00ad\5\36\20\2\u00ad)\3\2\2\2\u00ae\u00af\7\r\2\2\u00af\u00b0\7\20\2"+
		"\2\u00b0\u00b1\7\33\2\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\7\27\2\2\u00b3"+
		"+\3\2\2\2\u00b4\u00b5\7\16\2\2\u00b5\u00b6\7\20\2\2\u00b6\u00b7\7\33\2"+
		"\2\u00b7\u00b8\7\21\2\2\u00b8\u00b9\7\27\2\2\u00b9-\3\2\2\2\u00ba\u00bf"+
		"\5\60\31\2\u00bb\u00bc\7\31\2\2\u00bc\u00be\5\60\31\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"/\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\t\3\2\2\u00c3\61\3\2\2\2\u00c4"+
		"\u00c5\5\64\33\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\7\32\2\2\u00c7\u00c8"+
		"\5\64\33\2\u00c8\u00c9\7\25\2\2\u00c9\63\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\65\3\2\2\2\u00cc\u00d2\58\35\2\u00cd\u00d2\7\34\2\2\u00ce\u00d2\5\62"+
		"\32\2\u00cf\u00d0\7\17\2\2\u00d0\u00d2\5\66\34\2\u00d1\u00cc\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\67\3\2\2"+
		"\2\u00d3\u00da\7\33\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00d6\7\24\2\2\u00d6"+
		"\u00d7\5\62\32\2\u00d7\u00d8\7\25\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d3"+
		"\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da9\3\2\2\2\u00db\u00dc\5\62\32\2\u00dc"+
		"\u00dd\7\22\2\2\u00dd\u00de\7\30\2\2\u00de\u00df\5\62\32\2\u00df\u00e0"+
		"\7\23\2\2\u00e0;\3\2\2\2\nJ\\}\u0082\u0098\u00bf\u00d1\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}