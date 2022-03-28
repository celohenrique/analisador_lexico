package mainFile;
import analisadorLexico.minipascalLexer;
import analisadorLexico.minipascalParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;

import java.util.BitSet;

public class mainClassUm {
    public static void main(String[] args) {
        try {

            minipascalLexer lexer;
            minipascalParser parser;
            //le o arquivo imput.analisa = entrada para o analisador
            ///Users/marceloaraujo/Desktop/analisador_lexico/src/input.analisa
            lexer = new minipascalLexer(CharStreams.fromFileName("input.analisa"));
            //System.out.println("deu certo");
            //criando fluxo e tokens para passar pro parser
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            //criando um parser a partir do token
            parser = new minipascalParser(tokenStream);

            ErrorListener errorL = new ErrorListener();
            parser.addErrorListener(errorL);


            parser.prog();

            if(!errorL.isError())
                System.out.println("deu certo");

        }
        catch (Exception e) {
            System.err.println("ERROR " + e.getMessage());
        }
    }

}
    class ErrorListener implements ANTLRErrorListener {

        private boolean error = false;

        public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {

        }

        public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {

        }

        public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {

        }

        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

            System.err.println("Erro de sintaxe: ");
            System.err.println(e.getMessage());
            e.printStackTrace();

            error = true;

        }

        public boolean isError() {
            return error;
        }
    }

//problema importando a bliblioteca
//problema 1 ANTLR = versoes do antlr diferentes dando incompatibilidade
//problema ao localizar a pasta do imput
//