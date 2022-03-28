// Generated from D:/Users/mathe/Desktop/analisador_lexico/.idea\minipascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link minipascalParser}.
 */
public interface minipascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link minipascalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(minipascalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(minipascalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(minipascalParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(minipascalParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#decvariaveis}.
	 * @param ctx the parse tree
	 */
	void enterDecvariaveis(minipascalParser.DecvariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#decvariaveis}.
	 * @param ctx the parse tree
	 */
	void exitDecvariaveis(minipascalParser.DecvariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#decvars}.
	 * @param ctx the parse tree
	 */
	void enterDecvars(minipascalParser.DecvarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#decvars}.
	 * @param ctx the parse tree
	 */
	void exitDecvars(minipascalParser.DecvarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#list_ids}.
	 * @param ctx the parse tree
	 */
	void enterList_ids(minipascalParser.List_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#list_ids}.
	 * @param ctx the parse tree
	 */
	void exitList_ids(minipascalParser.List_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#decrotinas}.
	 * @param ctx the parse tree
	 */
	void enterDecrotinas(minipascalParser.DecrotinasContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#decrotinas}.
	 * @param ctx the parse tree
	 */
	void exitDecrotinas(minipascalParser.DecrotinasContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#decproceds}.
	 * @param ctx the parse tree
	 */
	void enterDecproceds(minipascalParser.DecprocedsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#decproceds}.
	 * @param ctx the parse tree
	 */
	void exitDecproceds(minipascalParser.DecprocedsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#formalparams}.
	 * @param ctx the parse tree
	 */
	void enterFormalparams(minipascalParser.FormalparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#formalparams}.
	 * @param ctx the parse tree
	 */
	void exitFormalparams(minipascalParser.FormalparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#paramsession}.
	 * @param ctx the parse tree
	 */
	void enterParamsession(minipascalParser.ParamsessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#paramsession}.
	 * @param ctx the parse tree
	 */
	void exitParamsession(minipascalParser.ParamsessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(minipascalParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(minipascalParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(minipascalParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(minipascalParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(minipascalParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(minipascalParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#floate}.
	 * @param ctx the parse tree
	 */
	void enterFloate(minipascalParser.FloateContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#floate}.
	 * @param ctx the parse tree
	 */
	void exitFloate(minipascalParser.FloateContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#stringei}.
	 * @param ctx the parse tree
	 */
	void enterStringei(minipascalParser.StringeiContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#stringei}.
	 * @param ctx the parse tree
	 */
	void exitStringei(minipascalParser.StringeiContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(minipascalParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(minipascalParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(minipascalParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(minipascalParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(minipascalParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(minipascalParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmdproced}.
	 * @param ctx the parse tree
	 */
	void enterCmdproced(minipascalParser.CmdprocedContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmdproced}.
	 * @param ctx the parse tree
	 */
	void exitCmdproced(minipascalParser.CmdprocedContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmdcondic}.
	 * @param ctx the parse tree
	 */
	void enterCmdcondic(minipascalParser.CmdcondicContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmdcondic}.
	 * @param ctx the parse tree
	 */
	void exitCmdcondic(minipascalParser.CmdcondicContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmdrepeat}.
	 * @param ctx the parse tree
	 */
	void enterCmdrepeat(minipascalParser.CmdrepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmdrepeat}.
	 * @param ctx the parse tree
	 */
	void exitCmdrepeat(minipascalParser.CmdrepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmdREAD}.
	 * @param ctx the parse tree
	 */
	void enterCmdREAD(minipascalParser.CmdREADContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmdREAD}.
	 * @param ctx the parse tree
	 */
	void exitCmdREAD(minipascalParser.CmdREADContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#cmdWRITE}.
	 * @param ctx the parse tree
	 */
	void enterCmdWRITE(minipascalParser.CmdWRITEContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#cmdWRITE}.
	 * @param ctx the parse tree
	 */
	void exitCmdWRITE(minipascalParser.CmdWRITEContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(minipascalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(minipascalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(minipascalParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(minipascalParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(minipascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(minipascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleexpression(minipascalParser.SimpleexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleexpression(minipascalParser.SimpleexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(minipascalParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(minipascalParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(minipascalParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(minipascalParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link minipascalParser#listexpressions}.
	 * @param ctx the parse tree
	 */
	void enterListexpressions(minipascalParser.ListexpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link minipascalParser#listexpressions}.
	 * @param ctx the parse tree
	 */
	void exitListexpressions(minipascalParser.ListexpressionsContext ctx);
}