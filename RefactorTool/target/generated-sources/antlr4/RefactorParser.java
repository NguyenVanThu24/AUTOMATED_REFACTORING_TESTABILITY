// Generated from Refactor.g4 by ANTLR 4.13.1

package com.refactor;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RefactorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IDENTIFIER=5, WS=6;
	public static final int
		RULE_statement = 0, RULE_dependencyCall = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "dependencyCall"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'getInstance'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "Refactor.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RefactorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DependencyCallContext dependencyCall() {
			return getRuleContext(DependencyCallContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RefactorParser.EOF, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefactorListener ) ((RefactorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefactorListener ) ((RefactorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			dependencyCall();
			setState(5);
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
	public static class DependencyCallContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(RefactorParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(RefactorParser.IDENTIFIER, i);
		}
		public DependencyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RefactorListener ) ((RefactorListener)listener).enterDependencyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RefactorListener ) ((RefactorListener)listener).exitDependencyCall(this);
		}
	}

	public final DependencyCallContext dependencyCall() throws RecognitionException {
		DependencyCallContext _localctx = new DependencyCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dependencyCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(IDENTIFIER);
			setState(8);
			match(T__0);
			setState(9);
			match(T__1);
			setState(10);
			match(T__2);
			setState(11);
			match(T__3);
			setState(12);
			match(T__0);
			setState(13);
			match(IDENTIFIER);
			setState(14);
			match(T__2);
			setState(15);
			match(IDENTIFIER);
			setState(16);
			match(T__3);
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
		"\u0004\u0001\u0006\u0013\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000"+
		"\u0000\u0010\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0007\u0001\u0000"+
		"\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000"+
		"\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007\b\u0005\u0005\u0000"+
		"\u0000\b\t\u0005\u0001\u0000\u0000\t\n\u0005\u0002\u0000\u0000\n\u000b"+
		"\u0005\u0003\u0000\u0000\u000b\f\u0005\u0004\u0000\u0000\f\r\u0005\u0001"+
		"\u0000\u0000\r\u000e\u0005\u0005\u0000\u0000\u000e\u000f\u0005\u0003\u0000"+
		"\u0000\u000f\u0010\u0005\u0005\u0000\u0000\u0010\u0011\u0005\u0004\u0000"+
		"\u0000\u0011\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}