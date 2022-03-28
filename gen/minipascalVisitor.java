// Generated from D:/Users/mathe/Desktop/analisador_lexico/.idea\minipascal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minipascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minipascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link minipascalParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(minipascalParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(minipascalParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#decvariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecvariaveis(minipascalParser.DecvariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#decvars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecvars(minipascalParser.DecvarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#list_ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_ids(minipascalParser.List_idsContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#decrotinas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrotinas(minipascalParser.DecrotinasContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#decproceds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecproceds(minipascalParser.DecprocedsContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#formalparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalparams(minipascalParser.FormalparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#paramsession}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsession(minipascalParser.ParamsessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(minipascalParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#inteiro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteiro(minipascalParser.InteiroContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(minipascalParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#floate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloate(minipascalParser.FloateContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#stringei}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringei(minipascalParser.StringeiContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(minipascalParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(minipascalParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmdattrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdattrib(minipascalParser.CmdattribContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmdproced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdproced(minipascalParser.CmdprocedContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmdcondic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdcondic(minipascalParser.CmdcondicContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmdrepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdrepeat(minipascalParser.CmdrepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmdREAD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdREAD(minipascalParser.CmdREADContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#cmdWRITE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdWRITE(minipascalParser.CmdWRITEContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(minipascalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(minipascalParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(minipascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#simpleexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleexpression(minipascalParser.SimpleexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(minipascalParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(minipascalParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link minipascalParser#listexpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListexpressions(minipascalParser.ListexpressionsContext ctx);
}