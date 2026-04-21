// Generated from visualbasic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class visualbasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SUB=9, 
		FUNCTION=10, DIM=11, AS=12, END=13, IF=14, THEN=15, ELSE=16, RETURN=17, 
		INTEGER=18, STRINGTYPE=19, BOOLEANTYPE=20, DOUBLETYPE=21, BOOLEAN=22, 
		STRING=23, NUMBER=24, ID=25, NEWLINE=26, WS=27;
	public static final int
		RULE_programa = 0, RULE_instrucao = 1, RULE_declaracaoSub = 2, RULE_declaracaoVariavel = 3, 
		RULE_declaracaoFuncao = 4, RULE_parametroLista = 5, RULE_parametro = 6, 
		RULE_bloco = 7, RULE_blocoIf = 8, RULE_atribuicao = 9, RULE_returnStmt = 10, 
		RULE_chamadaProcedimento = 11, RULE_argumentoLista = 12, RULE_expressao = 13, 
		RULE_termo = 14, RULE_fator = 15, RULE_tipo = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucao", "declaracaoSub", "declaracaoVariavel", "declaracaoFuncao", 
			"parametroLista", "parametro", "bloco", "blocoIf", "atribuicao", "returnStmt", 
			"chamadaProcedimento", "argumentoLista", "expressao", "termo", "fator", 
			"tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "','", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SUB", "FUNCTION", 
			"DIM", "AS", "END", "IF", "THEN", "ELSE", "RETURN", "INTEGER", "STRINGTYPE", 
			"BOOLEANTYPE", "DOUBLETYPE", "BOOLEAN", "STRING", "NUMBER", "ID", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "visualbasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public visualbasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(visualbasicParser.EOF, 0); }
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << FUNCTION) | (1L << DIM) | (1L << IF) | (1L << RETURN) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(34);
				instrucao();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public DeclaracaoVariavelContext declaracaoVariavel() {
			return getRuleContext(DeclaracaoVariavelContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(visualbasicParser.NEWLINE, 0); }
		public DeclaracaoSubContext declaracaoSub() {
			return getRuleContext(DeclaracaoSubContext.class,0);
		}
		public DeclaracaoFuncaoContext declaracaoFuncao() {
			return getRuleContext(DeclaracaoFuncaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ChamadaProcedimentoContext chamadaProcedimento() {
			return getRuleContext(ChamadaProcedimentoContext.class,0);
		}
		public BlocoIfContext blocoIf() {
			return getRuleContext(BlocoIfContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitInstrucao(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucao);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				declaracaoVariavel();
				setState(43);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				declaracaoSub();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				declaracaoFuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				atribuicao();
				setState(48);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				chamadaProcedimento();
				setState(51);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				blocoIf();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				returnStmt();
				setState(55);
				match(NEWLINE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				match(NEWLINE);
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

	public static class DeclaracaoSubContext extends ParserRuleContext {
		public List<TerminalNode> SUB() { return getTokens(visualbasicParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(visualbasicParser.SUB, i);
		}
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(visualbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(visualbasicParser.NEWLINE, i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(visualbasicParser.END, 0); }
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public DeclaracaoSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterDeclaracaoSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitDeclaracaoSub(this);
		}
	}

	public final DeclaracaoSubContext declaracaoSub() throws RecognitionException {
		DeclaracaoSubContext _localctx = new DeclaracaoSubContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(SUB);
			setState(61);
			match(ID);
			setState(62);
			match(T__0);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(63);
				parametroLista();
				}
			}

			setState(66);
			match(T__1);
			setState(67);
			match(NEWLINE);
			setState(68);
			bloco();
			setState(69);
			match(END);
			setState(70);
			match(SUB);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				match(NEWLINE);
				}
				break;
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

	public static class DeclaracaoVariavelContext extends ParserRuleContext {
		public TerminalNode DIM() { return getToken(visualbasicParser.DIM, 0); }
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public TerminalNode AS() { return getToken(visualbasicParser.AS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterDeclaracaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitDeclaracaoVariavel(this);
		}
	}

	public final DeclaracaoVariavelContext declaracaoVariavel() throws RecognitionException {
		DeclaracaoVariavelContext _localctx = new DeclaracaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(DIM);
			setState(75);
			match(ID);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(76);
				match(AS);
				setState(77);
				tipo();
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(80);
				match(T__2);
				setState(81);
				expressao();
				}
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

	public static class DeclaracaoFuncaoContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(visualbasicParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(visualbasicParser.FUNCTION, i);
		}
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public TerminalNode AS() { return getToken(visualbasicParser.AS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(visualbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(visualbasicParser.NEWLINE, i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode END() { return getToken(visualbasicParser.END, 0); }
		public ParametroListaContext parametroLista() {
			return getRuleContext(ParametroListaContext.class,0);
		}
		public DeclaracaoFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoFuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterDeclaracaoFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitDeclaracaoFuncao(this);
		}
	}

	public final DeclaracaoFuncaoContext declaracaoFuncao() throws RecognitionException {
		DeclaracaoFuncaoContext _localctx = new DeclaracaoFuncaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracaoFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(FUNCTION);
			setState(85);
			match(ID);
			setState(86);
			match(T__0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(87);
				parametroLista();
				}
			}

			setState(90);
			match(T__1);
			setState(91);
			match(AS);
			setState(92);
			tipo();
			setState(93);
			match(NEWLINE);
			setState(94);
			bloco();
			setState(95);
			match(END);
			setState(96);
			match(FUNCTION);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(97);
				match(NEWLINE);
				}
				break;
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

	public static class ParametroListaContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametroListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterParametroLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitParametroLista(this);
		}
	}

	public final ParametroListaContext parametroLista() throws RecognitionException {
		ParametroListaContext _localctx = new ParametroListaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametroLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			parametro();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(101);
				match(T__3);
				setState(102);
				parametro();
				}
				}
				setState(107);
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public TerminalNode AS() { return getToken(visualbasicParser.AS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(ID);
			setState(109);
			match(AS);
			setState(110);
			tipo();
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
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << FUNCTION) | (1L << DIM) | (1L << IF) | (1L << RETURN) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(112);
				instrucao();
				}
				}
				setState(117);
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

	public static class BlocoIfContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(visualbasicParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(visualbasicParser.IF, i);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode THEN() { return getToken(visualbasicParser.THEN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(visualbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(visualbasicParser.NEWLINE, i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode END() { return getToken(visualbasicParser.END, 0); }
		public TerminalNode ELSE() { return getToken(visualbasicParser.ELSE, 0); }
		public BlocoIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterBlocoIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitBlocoIf(this);
		}
	}

	public final BlocoIfContext blocoIf() throws RecognitionException {
		BlocoIfContext _localctx = new BlocoIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blocoIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(IF);
			setState(119);
			expressao();
			setState(120);
			match(THEN);
			setState(121);
			match(NEWLINE);
			setState(122);
			bloco();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(123);
				match(ELSE);
				setState(124);
				match(NEWLINE);
				setState(125);
				bloco();
				}
			}

			setState(128);
			match(END);
			setState(129);
			match(IF);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(130);
				match(NEWLINE);
				}
				break;
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(ID);
			setState(134);
			match(T__2);
			setState(135);
			expressao();
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

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(visualbasicParser.RETURN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RETURN);
			setState(138);
			expressao();
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

	public static class ChamadaProcedimentoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public ChamadaProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaProcedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterChamadaProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitChamadaProcedimento(this);
		}
	}

	public final ChamadaProcedimentoContext chamadaProcedimento() throws RecognitionException {
		ChamadaProcedimentoContext _localctx = new ChamadaProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_chamadaProcedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(T__0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(142);
				argumentoLista();
				}
			}

			setState(145);
			match(T__1);
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

	public static class ArgumentoListaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ArgumentoListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoLista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterArgumentoLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitArgumentoLista(this);
		}
	}

	public final ArgumentoListaContext argumentoLista() throws RecognitionException {
		ArgumentoListaContext _localctx = new ArgumentoListaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argumentoLista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			expressao();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(148);
				match(T__3);
				setState(149);
				expressao();
				}
				}
				setState(154);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			termo();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(157);
				termo();
				}
				}
				setState(162);
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
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			fator();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				fator();
				}
				}
				setState(170);
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

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(visualbasicParser.ID, 0); }
		public ArgumentoListaContext argumentoLista() {
			return getRuleContext(ArgumentoListaContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(visualbasicParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(visualbasicParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(visualbasicParser.BOOLEAN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fator);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(ID);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(172);
					match(T__0);
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << STRING) | (1L << NUMBER) | (1L << ID))) != 0)) {
						{
						setState(173);
						argumentoLista();
						}
					}

					setState(176);
					match(T__1);
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(BOOLEAN);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(T__0);
				setState(183);
				expressao();
				setState(184);
				match(T__1);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(visualbasicParser.INTEGER, 0); }
		public TerminalNode STRINGTYPE() { return getToken(visualbasicParser.STRINGTYPE, 0); }
		public TerminalNode BOOLEANTYPE() { return getToken(visualbasicParser.BOOLEANTYPE, 0); }
		public TerminalNode DOUBLETYPE() { return getToken(visualbasicParser.DOUBLETYPE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof visualbasicListener ) ((visualbasicListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << STRINGTYPE) | (1L << BOOLEANTYPE) | (1L << DOUBLETYPE))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\5\4C\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\5\5U\n\5"+
		"\3\6\3\6\3\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n\6\3\7"+
		"\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b\3\b\3\b\3\b\3\t\7\tt\n\t\f\t\16\t"+
		"w\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\n\3\n\3\n\5\n\u0086"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0092\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\7\16\u0099\n\16\f\16\16\16\u009c\13\16\3\17\3\17\3\17"+
		"\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20\7\20\u00a9\n\20"+
		"\f\20\16\20\u00ac\13\20\3\21\3\21\3\21\5\21\u00b1\n\21\3\21\5\21\u00b4"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00bd\n\21\3\22\3\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\3\2\7\b\3\2\t\n"+
		"\3\2\24\27\2\u00cb\2\'\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bL\3\2\2\2\nV\3\2"+
		"\2\2\ff\3\2\2\2\16n\3\2\2\2\20u\3\2\2\2\22x\3\2\2\2\24\u0087\3\2\2\2\26"+
		"\u008b\3\2\2\2\30\u008e\3\2\2\2\32\u0095\3\2\2\2\34\u009d\3\2\2\2\36\u00a5"+
		"\3\2\2\2 \u00bc\3\2\2\2\"\u00be\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2"+
		"\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,-\5\b"+
		"\5\2-.\7\34\2\2.=\3\2\2\2/=\5\6\4\2\60=\5\n\6\2\61\62\5\24\13\2\62\63"+
		"\7\34\2\2\63=\3\2\2\2\64\65\5\30\r\2\65\66\7\34\2\2\66=\3\2\2\2\67=\5"+
		"\22\n\289\5\26\f\29:\7\34\2\2:=\3\2\2\2;=\7\34\2\2<,\3\2\2\2</\3\2\2\2"+
		"<\60\3\2\2\2<\61\3\2\2\2<\64\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<;\3\2\2\2="+
		"\5\3\2\2\2>?\7\13\2\2?@\7\33\2\2@B\7\3\2\2AC\5\f\7\2BA\3\2\2\2BC\3\2\2"+
		"\2CD\3\2\2\2DE\7\4\2\2EF\7\34\2\2FG\5\20\t\2GH\7\17\2\2HJ\7\13\2\2IK\7"+
		"\34\2\2JI\3\2\2\2JK\3\2\2\2K\7\3\2\2\2LM\7\r\2\2MP\7\33\2\2NO\7\16\2\2"+
		"OQ\5\"\22\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RS\7\5\2\2SU\5\34\17\2TR\3\2"+
		"\2\2TU\3\2\2\2U\t\3\2\2\2VW\7\f\2\2WX\7\33\2\2XZ\7\3\2\2Y[\5\f\7\2ZY\3"+
		"\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\4\2\2]^\7\16\2\2^_\5\"\22\2_`\7\34\2"+
		"\2`a\5\20\t\2ab\7\17\2\2bd\7\f\2\2ce\7\34\2\2dc\3\2\2\2de\3\2\2\2e\13"+
		"\3\2\2\2fk\5\16\b\2gh\7\6\2\2hj\5\16\b\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2l\r\3\2\2\2mk\3\2\2\2no\7\33\2\2op\7\16\2\2pq\5\"\22\2q\17\3"+
		"\2\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\21\3\2\2\2w"+
		"u\3\2\2\2xy\7\20\2\2yz\5\34\17\2z{\7\21\2\2{|\7\34\2\2|\u0080\5\20\t\2"+
		"}~\7\22\2\2~\177\7\34\2\2\177\u0081\5\20\t\2\u0080}\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\17\2\2\u0083\u0085\7\20\2\2"+
		"\u0084\u0086\7\34\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23"+
		"\3\2\2\2\u0087\u0088\7\33\2\2\u0088\u0089\7\5\2\2\u0089\u008a\5\34\17"+
		"\2\u008a\25\3\2\2\2\u008b\u008c\7\23\2\2\u008c\u008d\5\34\17\2\u008d\27"+
		"\3\2\2\2\u008e\u008f\7\33\2\2\u008f\u0091\7\3\2\2\u0090\u0092\5\32\16"+
		"\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\7\4\2\2\u0094\31\3\2\2\2\u0095\u009a\5\34\17\2\u0096\u0097\7\6\2\2\u0097"+
		"\u0099\5\34\17\2\u0098\u0096\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\33\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u00a2\5\36\20\2\u009e\u009f\t\2\2\2\u009f\u00a1\5\36\20\2\u00a0\u009e"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00aa\5 \21\2\u00a6\u00a7\t\3\2"+
		"\2\u00a7\u00a9\5 \21\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\37\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b3\7\33\2\2\u00ae\u00b0\7\3\2\2\u00af\u00b1\5\32\16\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\7\4\2\2\u00b3"+
		"\u00ae\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00bd\3\2\2\2\u00b5\u00bd\7\32"+
		"\2\2\u00b6\u00bd\7\31\2\2\u00b7\u00bd\7\30\2\2\u00b8\u00b9\7\3\2\2\u00b9"+
		"\u00ba\5\34\17\2\u00ba\u00bb\7\4\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ad\3"+
		"\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc"+
		"\u00b8\3\2\2\2\u00bd!\3\2\2\2\u00be\u00bf\t\4\2\2\u00bf#\3\2\2\2\25\'"+
		"<BJPTZdku\u0080\u0085\u0091\u009a\u00a2\u00aa\u00b0\u00b3\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}