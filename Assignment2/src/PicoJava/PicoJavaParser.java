package picoJava;

import beaver.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "PicoJava.grammar".
 */
public class PicoJavaParser extends Parser {
	static public class Terminals {
		static public final short EOF = 0;
		static public final short IDENTIFIER = 1;
		static public final short LPAREN = 2;
		static public final short BOOLEAN = 3;
		static public final short LBRACE = 4;
		static public final short RBRACE = 5;
		static public final short OP_AND = 6;
		static public final short WHILE = 7;
		static public final short OP_OR = 8;
		static public final short DOT = 9;
		static public final short RPAREN = 10;
		static public final short CLASS = 11;
		static public final short SEMICOLON = 12;
		static public final short ASSIGN = 13;
		static public final short EXTENDS = 14;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9nrabjF544GHh#zNrmOTbZsCWiei88WqPWDGQ8l9ZwOG9GdJFmr$bnHhYegi6jvPhOO9WI" +
		"xSwhggwwfxfaUIPyKgg2w1dgiiehAcwcgcaBxacOhMc6IjR6DjSeiQLOFc4$jfpQIgWKg7k" +
		"cXvjHLeCXLn$t4TjLGP2CjftgAoeBMDQyszA0FI$24cWLDgwaPUgxQ3xNGNVIYrjYXI1HoY" +
		"XQhROcL7jb#9fjZnjaIiy8ieUCptpvR8vDd$odUSPhtcwY6#uajuwiyMqzrX2wY0qvsbnmz" +
		"szWEFIjKDT3bHESvu#PdZ1dVKFGGfv3cuXmZX64Sty3OWZwyTlqUFdWSmJkFLs3Pumttps0" +
		"Vzk0Wq$C5FC$ku$cFi0FRiEkvjtxUywptU7ItXpypW9SUx$odPfY9jznlPt9lCl6zFNpjbV" +
		"iWazjKEknlOg$joYuzyoUntnFxEx7dS0n7Teezj9Ca#ys#sY#xI3kT9Qx3RUIutm9$5pV7d" +
		"RRGDtIvxnvhJUAO#8OYQZh48Mkp$4Nn7pAXa1AW0$pyFs5qRcm=");

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	private final Action[] actions;

	public PicoJavaParser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = block
			RETURN3,	// [1] block = LBRACE block_statements RBRACE; returns 'RBRACE' although none is marked
			Action.NONE,  	// [2] block_statements = 
			RETURN2,	// [3] block_statements = block_statement block_statements; returns 'block_statements' although none is marked
			Action.RETURN,	// [4] block_statement = class_decl
			Action.RETURN,	// [5] block_statement = var_decl
			Action.RETURN,	// [6] block_statement = stmt
			RETURN4,	// [7] class_decl = CLASS IDENTIFIER extends_opt block; returns 'block' although none is marked
			RETURN3,	// [8] var_decl = name IDENTIFIER SEMICOLON; returns 'SEMICOLON' although none is marked
			Action.RETURN,	// [9] stmt = assign_stmt
			Action.RETURN,	// [10] stmt = while_stmt
			Action.NONE,  	// [11] extends_opt = 
			RETURN2,	// [12] extends_opt = EXTENDS use; returns 'use' although none is marked
			Action.RETURN,	// [13] use = IDENTIFIER
			RETURN4,	// [14] assign_stmt = name ASSIGN exp SEMICOLON; returns 'SEMICOLON' although none is marked
			RETURN5,	// [15] while_stmt = WHILE LPAREN exp RPAREN stmt; returns 'stmt' although none is marked
			Action.RETURN,	// [16] exp = name
			Action.RETURN,	// [17] exp = BOOLEAN
			RETURN3,	// [18] exp = exp OP_AND exp; returns 'exp' although none is marked
			RETURN3,	// [19] exp = exp OP_OR exp; returns 'exp' although none is marked
			RETURN3,	// [20] exp = LPAREN exp RPAREN; returns 'RPAREN' although none is marked
			Action.RETURN,	// [21] name = IDENTIFIER
			RETURN3	// [22] name = name DOT use; returns 'use' although none is marked
		};
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
