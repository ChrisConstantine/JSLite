// Generated from E:/Home/Workspace/IntelliJ/JSLite/src/main/resources\JSLite.g4 by ANTLR 4.7
package com.jslite.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSLiteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, IntegerLiteral=15, DecimalLiteral=16, 
		VAR=17, DEF=18, RETURN=19, BREAK=20, IF=21, ELSE=22, WHILE=23, TRUE=24, 
		FALSE=25, ASSIGN=26, COMMA=27, SEMICOMMA=28, LP=29, RP=30, LBRACE=31, 
		RBRACE=32, LBRACKET=33, RBRACKET=34, WS=35, Identifier=36, StringLiteral=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "IntegerLiteral", "DecimalLiteral", 
		"VAR", "DEF", "RETURN", "BREAK", "IF", "ELSE", "WHILE", "TRUE", "FALSE", 
		"ASSIGN", "COMMA", "SEMICOMMA", "LP", "RP", "LBRACE", "RBRACE", "LBRACKET", 
		"RBRACKET", "WS", "Identifier", "StringLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", null, null, "'var'", "'def'", 
		"'return'", "'break'", "'if'", "'else'", "'while'", "'true'", "'false'", 
		"'='", "','", "';'", "'('", "')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "IntegerLiteral", "DecimalLiteral", "VAR", "DEF", "RETURN", 
		"BREAK", "IF", "ELSE", "WHILE", "TRUE", "FALSE", "ASSIGN", "COMMA", "SEMICOMMA", 
		"LP", "RP", "LBRACE", "RBRACE", "LBRACKET", "RBRACKET", "WS", "Identifier", 
		"StringLiteral"
	};
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


	public JSLiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\6\20q\n\20\r\20\16\20"+
		"r\3\21\6\21v\n\21\r\21\16\21w\3\21\3\21\6\21|\n\21\r\21\16\21}\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3!\3!\3\"\3\"\3#\3#\3$\6$\u00c1\n$\r$\16$\u00c2\3$\3$\3%\3%\7%\u00c9"+
		"\n%\f%\16%\u00cc\13%\3&\3&\7&\u00d0\n&\f&\16&\u00d3\13&\3&\3&\2\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'\3\2\7\3\2\62;\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\"+
		"c|\3\2$$\2\u00db\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2"+
		"\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2"+
		"\2\2\25`\3\2\2\2\27c\3\2\2\2\31f\3\2\2\2\33i\3\2\2\2\35l\3\2\2\2\37p\3"+
		"\2\2\2!u\3\2\2\2#\177\3\2\2\2%\u0083\3\2\2\2\'\u0087\3\2\2\2)\u008e\3"+
		"\2\2\2+\u0094\3\2\2\2-\u0097\3\2\2\2/\u009c\3\2\2\2\61\u00a2\3\2\2\2\63"+
		"\u00a7\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b3"+
		"\3\2\2\2=\u00b5\3\2\2\2?\u00b7\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2E"+
		"\u00bd\3\2\2\2G\u00c0\3\2\2\2I\u00c6\3\2\2\2K\u00cd\3\2\2\2MN\7#\2\2N"+
		"\4\3\2\2\2OP\7,\2\2P\6\3\2\2\2QR\7\61\2\2R\b\3\2\2\2ST\7\'\2\2T\n\3\2"+
		"\2\2UV\7-\2\2V\f\3\2\2\2WX\7/\2\2X\16\3\2\2\2YZ\7>\2\2Z\20\3\2\2\2[\\"+
		"\7@\2\2\\\22\3\2\2\2]^\7>\2\2^_\7?\2\2_\24\3\2\2\2`a\7@\2\2ab\7?\2\2b"+
		"\26\3\2\2\2cd\7?\2\2de\7?\2\2e\30\3\2\2\2fg\7#\2\2gh\7?\2\2h\32\3\2\2"+
		"\2ij\7(\2\2jk\7(\2\2k\34\3\2\2\2lm\7~\2\2mn\7~\2\2n\36\3\2\2\2oq\t\2\2"+
		"\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s \3\2\2\2tv\t\2\2\2ut\3\2\2"+
		"\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7\60\2\2z|\t\2\2\2{z\3\2"+
		"\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\"\3\2\2\2\177\u0080\7x\2\2\u0080\u0081"+
		"\7c\2\2\u0081\u0082\7t\2\2\u0082$\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7h\2\2\u0086&\3\2\2\2\u0087\u0088\7t\2\2\u0088\u0089"+
		"\7g\2\2\u0089\u008a\7v\2\2\u008a\u008b\7w\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7p\2\2\u008d(\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092\u0093\7m\2\2\u0093*\3\2\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7h\2\2\u0096,\3\2\2\2\u0097\u0098\7g\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b.\3\2\2\2\u009c"+
		"\u009d\7y\2\2\u009d\u009e\7j\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7n\2\2"+
		"\u00a0\u00a1\7g\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7"+
		"t\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7g\2\2\u00a6\62\3\2\2\2\u00a7\u00a8"+
		"\7h\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\66\3\2\2\2\u00af"+
		"\u00b0\7.\2\2\u00b08\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2:\3\2\2\2\u00b3\u00b4"+
		"\7*\2\2\u00b4<\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7"+
		"}\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7\177\2\2\u00baB\3\2\2\2\u00bb\u00bc"+
		"\7]\2\2\u00bcD\3\2\2\2\u00bd\u00be\7_\2\2\u00beF\3\2\2\2\u00bf\u00c1\t"+
		"\3\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b$\2\2\u00c5H\3\2\2\2\u00c6"+
		"\u00ca\t\4\2\2\u00c7\u00c9\t\5\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cbJ\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00d1\7$\2\2\u00ce\u00d0\n\6\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5L\3\2\2\2\t\2rw}\u00c2"+
		"\u00ca\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}