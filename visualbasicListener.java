// Generated from visualbasic.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link visualbasicParser}.
 */
public interface visualbasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(visualbasicParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(visualbasicParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(visualbasicParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(visualbasicParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#declaracaoSub}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoSub(visualbasicParser.DeclaracaoSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#declaracaoSub}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoSub(visualbasicParser.DeclaracaoSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariavel(visualbasicParser.DeclaracaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#declaracaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariavel(visualbasicParser.DeclaracaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoFuncao(visualbasicParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#declaracaoFuncao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoFuncao(visualbasicParser.DeclaracaoFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void enterParametroLista(visualbasicParser.ParametroListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#parametroLista}.
	 * @param ctx the parse tree
	 */
	void exitParametroLista(visualbasicParser.ParametroListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(visualbasicParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(visualbasicParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(visualbasicParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(visualbasicParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#blocoIf}.
	 * @param ctx the parse tree
	 */
	void enterBlocoIf(visualbasicParser.BlocoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#blocoIf}.
	 * @param ctx the parse tree
	 */
	void exitBlocoIf(visualbasicParser.BlocoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(visualbasicParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(visualbasicParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(visualbasicParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(visualbasicParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void enterChamadaProcedimento(visualbasicParser.ChamadaProcedimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#chamadaProcedimento}.
	 * @param ctx the parse tree
	 */
	void exitChamadaProcedimento(visualbasicParser.ChamadaProcedimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoLista(visualbasicParser.ArgumentoListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#argumentoLista}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoLista(visualbasicParser.ArgumentoListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(visualbasicParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(visualbasicParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(visualbasicParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(visualbasicParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(visualbasicParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(visualbasicParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link visualbasicParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(visualbasicParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link visualbasicParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(visualbasicParser.TipoContext ctx);
}