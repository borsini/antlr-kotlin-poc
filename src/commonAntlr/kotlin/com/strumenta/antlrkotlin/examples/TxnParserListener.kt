// Generated from java-escape by ANTLR 4.7.1
package com.strumenta.antlrkotlin.examples

import org.antlr.v4.kotlinruntime.tree.ParseTreeListener

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TxnParser}.
 */
interface TxnParserListener : ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TxnParser#txns}.
	 * @param ctx the parse tree
	 */
	fun enterTxns(ctx: TxnParser.TxnsContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txns}.
	 * @param ctx the parse tree
	 */
	fun exitTxns(ctx: TxnParser.TxnsContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#txn}.
	 * @param ctx the parse tree
	 */
	fun enterTxn(ctx: TxnParser.TxnContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txn}.
	 * @param ctx the parse tree
	 */
	fun exitTxn(ctx: TxnParser.TxnContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#date}.
	 * @param ctx the parse tree
	 */
	fun enterDate(ctx: TxnParser.DateContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#date}.
	 * @param ctx the parse tree
	 */
	fun exitDate(ctx: TxnParser.DateContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#code}.
	 * @param ctx the parse tree
	 */
	fun enterCode(ctx: TxnParser.CodeContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#code}.
	 * @param ctx the parse tree
	 */
	fun exitCode(ctx: TxnParser.CodeContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#code_value}.
	 * @param ctx the parse tree
	 */
	fun enterCode_value(ctx: TxnParser.Code_valueContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#code_value}.
	 * @param ctx the parse tree
	 */
	fun exitCode_value(ctx: TxnParser.Code_valueContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#description}.
	 * @param ctx the parse tree
	 */
	fun enterDescription(ctx: TxnParser.DescriptionContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#description}.
	 * @param ctx the parse tree
	 */
	fun exitDescription(ctx: TxnParser.DescriptionContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#text}.
	 * @param ctx the parse tree
	 */
	fun enterText(ctx: TxnParser.TextContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#text}.
	 * @param ctx the parse tree
	 */
	fun exitText(ctx: TxnParser.TextContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#txn_meta}.
	 * @param ctx the parse tree
	 */
	fun enterTxn_meta(ctx: TxnParser.Txn_metaContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txn_meta}.
	 * @param ctx the parse tree
	 */
	fun exitTxn_meta(ctx: TxnParser.Txn_metaContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#txn_meta_uuid}.
	 * @param ctx the parse tree
	 */
	fun enterTxn_meta_uuid(ctx: TxnParser.Txn_meta_uuidContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txn_meta_uuid}.
	 * @param ctx the parse tree
	 */
	fun exitTxn_meta_uuid(ctx: TxnParser.Txn_meta_uuidContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#txn_meta_location}.
	 * @param ctx the parse tree
	 */
	fun enterTxn_meta_location(ctx: TxnParser.Txn_meta_locationContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txn_meta_location}.
	 * @param ctx the parse tree
	 */
	fun exitTxn_meta_location(ctx: TxnParser.Txn_meta_locationContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#txn_meta_tags}.
	 * @param ctx the parse tree
	 */
	fun enterTxn_meta_tags(ctx: TxnParser.Txn_meta_tagsContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txn_meta_tags}.
	 * @param ctx the parse tree
	 */
	fun exitTxn_meta_tags(ctx: TxnParser.Txn_meta_tagsContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#geo_uri}.
	 * @param ctx the parse tree
	 */
	fun enterGeo_uri(ctx: TxnParser.Geo_uriContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#geo_uri}.
	 * @param ctx the parse tree
	 */
	fun exitGeo_uri(ctx: TxnParser.Geo_uriContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#lat}.
	 * @param ctx the parse tree
	 */
	fun enterLat(ctx: TxnParser.LatContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#lat}.
	 * @param ctx the parse tree
	 */
	fun exitLat(ctx: TxnParser.LatContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#lon}.
	 * @param ctx the parse tree
	 */
	fun enterLon(ctx: TxnParser.LonContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#lon}.
	 * @param ctx the parse tree
	 */
	fun exitLon(ctx: TxnParser.LonContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#alt}.
	 * @param ctx the parse tree
	 */
	fun enterAlt(ctx: TxnParser.AltContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#alt}.
	 * @param ctx the parse tree
	 */
	fun exitAlt(ctx: TxnParser.AltContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#tags}.
	 * @param ctx the parse tree
	 */
	fun enterTags(ctx: TxnParser.TagsContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#tags}.
	 * @param ctx the parse tree
	 */
	fun exitTags(ctx: TxnParser.TagsContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#tag}.
	 * @param ctx the parse tree
	 */
	fun enterTag(ctx: TxnParser.TagContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#tag}.
	 * @param ctx the parse tree
	 */
	fun exitTag(ctx: TxnParser.TagContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#txn_comment}.
	 * @param ctx the parse tree
	 */
	fun enterTxn_comment(ctx: TxnParser.Txn_commentContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#txn_comment}.
	 * @param ctx the parse tree
	 */
	fun exitTxn_comment(ctx: TxnParser.Txn_commentContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#indent}.
	 * @param ctx the parse tree
	 */
	fun enterIndent(ctx: TxnParser.IndentContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#indent}.
	 * @param ctx the parse tree
	 */
	fun exitIndent(ctx: TxnParser.IndentContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#comment}.
	 * @param ctx the parse tree
	 */
	fun enterComment(ctx: TxnParser.CommentContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#comment}.
	 * @param ctx the parse tree
	 */
	fun exitComment(ctx: TxnParser.CommentContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#postings}.
	 * @param ctx the parse tree
	 */
	fun enterPostings(ctx: TxnParser.PostingsContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#postings}.
	 * @param ctx the parse tree
	 */
	fun exitPostings(ctx: TxnParser.PostingsContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#posting}.
	 * @param ctx the parse tree
	 */
	fun enterPosting(ctx: TxnParser.PostingContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#posting}.
	 * @param ctx the parse tree
	 */
	fun exitPosting(ctx: TxnParser.PostingContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#last_posting}.
	 * @param ctx the parse tree
	 */
	fun enterLast_posting(ctx: TxnParser.Last_postingContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#last_posting}.
	 * @param ctx the parse tree
	 */
	fun exitLast_posting(ctx: TxnParser.Last_postingContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#opt_unit}.
	 * @param ctx the parse tree
	 */
	fun enterOpt_unit(ctx: TxnParser.Opt_unitContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#opt_unit}.
	 * @param ctx the parse tree
	 */
	fun exitOpt_unit(ctx: TxnParser.Opt_unitContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#opt_comment}.
	 * @param ctx the parse tree
	 */
	fun enterOpt_comment(ctx: TxnParser.Opt_commentContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#opt_comment}.
	 * @param ctx the parse tree
	 */
	fun exitOpt_comment(ctx: TxnParser.Opt_commentContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#opt_position}.
	 * @param ctx the parse tree
	 */
	fun enterOpt_position(ctx: TxnParser.Opt_positionContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#opt_position}.
	 * @param ctx the parse tree
	 */
	fun exitOpt_position(ctx: TxnParser.Opt_positionContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#opt_opening_pos}.
	 * @param ctx the parse tree
	 */
	fun enterOpt_opening_pos(ctx: TxnParser.Opt_opening_posContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#opt_opening_pos}.
	 * @param ctx the parse tree
	 */
	fun exitOpt_opening_pos(ctx: TxnParser.Opt_opening_posContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#closing_pos}.
	 * @param ctx the parse tree
	 */
	fun enterClosing_pos(ctx: TxnParser.Closing_posContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#closing_pos}.
	 * @param ctx the parse tree
	 */
	fun exitClosing_pos(ctx: TxnParser.Closing_posContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#account}.
	 * @param ctx the parse tree
	 */
	fun enterAccount(ctx: TxnParser.AccountContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#account}.
	 * @param ctx the parse tree
	 */
	fun exitAccount(ctx: TxnParser.AccountContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#amount}.
	 * @param ctx the parse tree
	 */
	fun enterAmount(ctx: TxnParser.AmountContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#amount}.
	 * @param ctx the parse tree
	 */
	fun exitAmount(ctx: TxnParser.AmountContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#unit}.
	 * @param ctx the parse tree
	 */
	fun enterUnit(ctx: TxnParser.UnitContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#unit}.
	 * @param ctx the parse tree
	 */
	fun exitUnit(ctx: TxnParser.UnitContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#sp}.
	 * @param ctx the parse tree
	 */
	fun enterSp(ctx: TxnParser.SpContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#sp}.
	 * @param ctx the parse tree
	 */
	fun exitSp(ctx: TxnParser.SpContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#opt_sp}.
	 * @param ctx the parse tree
	 */
	fun enterOpt_sp(ctx: TxnParser.Opt_spContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#opt_sp}.
	 * @param ctx the parse tree
	 */
	fun exitOpt_sp(ctx: TxnParser.Opt_spContext)
	/**
	 * Enter a parse tree produced by {@link TxnParser#blankline}.
	 * @param ctx the parse tree
	 */
	fun enterBlankline(ctx: TxnParser.BlanklineContext)
	/**
	 * Exit a parse tree produced by {@link TxnParser#blankline}.
	 * @param ctx the parse tree
	 */
	fun exitBlankline(ctx: TxnParser.BlanklineContext)
}