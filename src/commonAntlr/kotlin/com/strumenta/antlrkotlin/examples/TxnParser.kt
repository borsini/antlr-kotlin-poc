// Generated from java-escape by ANTLR 4.7.1
package com.strumenta.antlrkotlin.examples;
import com.strumenta.kotlinmultiplatform.asCharArray
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import kotlin.reflect.KClass

class TxnParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(TxnParser.TxnsContext::class,
                                                              TxnParser.TxnContext::class,
                                                              TxnParser.DateContext::class,
                                                              TxnParser.CodeContext::class,
                                                              TxnParser.Code_valueContext::class,
                                                              TxnParser.DescriptionContext::class,
                                                              TxnParser.TextContext::class,
                                                              TxnParser.Txn_metaContext::class,
                                                              TxnParser.Txn_meta_uuidContext::class,
                                                              TxnParser.Txn_meta_locationContext::class,
                                                              TxnParser.Txn_meta_tagsContext::class,
                                                              TxnParser.Geo_uriContext::class,
                                                              TxnParser.LatContext::class,
                                                              TxnParser.LonContext::class,
                                                              TxnParser.AltContext::class,
                                                              TxnParser.TagsContext::class,
                                                              TxnParser.TagContext::class,
                                                              TxnParser.Txn_commentContext::class,
                                                              TxnParser.IndentContext::class,
                                                              TxnParser.CommentContext::class,
                                                              TxnParser.PostingsContext::class,
                                                              TxnParser.PostingContext::class,
                                                              TxnParser.Last_postingContext::class,
                                                              TxnParser.Opt_unitContext::class,
                                                              TxnParser.Opt_commentContext::class,
                                                              TxnParser.Opt_positionContext::class,
                                                              TxnParser.Opt_opening_posContext::class,
                                                              TxnParser.Closing_posContext::class,
                                                              TxnParser.AccountContext::class,
                                                              TxnParser.AmountContext::class,
                                                              TxnParser.UnitContext::class,
                                                              TxnParser.SpContext::class,
                                                              TxnParser.Opt_spContext::class,
                                                              TxnParser.BlanklineContext::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "TxnParser.g4"

    override val tokenNames: Array<String?>?
        get() = TxnParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = TxnParser.Companion.ruleNames
    override val atn: ATN
        get() = TxnParser.Companion.ATN
    override val vocabulary: Vocabulary
        get() = TxnParser.Companion.VOCABULARY

    enum class Tokens(val id: Int) {
        EOF(-1),
        UUID_NAME(1),
        LOCATION_NAME(2),
        GEO_NAME(3),
        TAGS_NAME(4),
        UUID_VALUE(5),
        DATE(6),
        TS(7),
        TS_TZ(8),
        INT(9),
        NUMBER(10),
        ID(11),
        SUBID(12),
        QUOTE(13),
        L_BRACE(14),
        R_BRACE(15),
        L_CURLY(16),
        R_CURLY(17),
        L_SQUARE(18),
        R_SQUARE(19),
        L_ANGLE(20),
        R_ANGLE(21),
        HASH(22),
        AT(23),
        EQUAL(24),
        SPACE(25),
        TAB(26),
        COMMA(27),
        SEMICOLON(28),
        COLON(29),
        NL(30),
        ANYCHAR(31)
    }

    enum class Rules(val id: Int) {
        RULE_txns(0),
        RULE_txn(1),
        RULE_date(2),
        RULE_code(3),
        RULE_code_value(4),
        RULE_description(5),
        RULE_text(6),
        RULE_txn_meta(7),
        RULE_txn_meta_uuid(8),
        RULE_txn_meta_location(9),
        RULE_txn_meta_tags(10),
        RULE_geo_uri(11),
        RULE_lat(12),
        RULE_lon(13),
        RULE_alt(14),
        RULE_tags(15),
        RULE_tag(16),
        RULE_txn_comment(17),
        RULE_indent(18),
        RULE_comment(19),
        RULE_postings(20),
        RULE_posting(21),
        RULE_last_posting(22),
        RULE_opt_unit(23),
        RULE_opt_comment(24),
        RULE_opt_position(25),
        RULE_opt_opening_pos(26),
        RULE_closing_pos(27),
        RULE_account(28),
        RULE_amount(29),
        RULE_unit(30),
        RULE_sp(31),
        RULE_opt_sp(32),
        RULE_blankline(33)
    }

	@ThreadLocal
	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("txns", "txn", "date", "code", "code_value", 
                                "description", "text", "txn_meta", "txn_meta_uuid", 
                                "txn_meta_location", "txn_meta_tags", "geo_uri", 
                                "lat", "lon", "alt", "tags", "tag", "txn_comment", 
                                "indent", "comment", "postings", "posting", 
                                "last_posting", "opt_unit", "opt_comment", 
                                "opt_position", "opt_opening_pos", "closing_pos", 
                                "account", "amount", "unit", "sp", "opt_sp", 
                                "blankline")

        private val LITERAL_NAMES: List<String?> = listOf(null, "'uuid'", 
                                                          "'location'", 
                                                          "'geo'", "'tags'", 
                                                          null, null, null, 
                                                          null, null, null, 
                                                          null, null, "'''", 
                                                          "'('", "')'", 
                                                          "'{'", "'}'", 
                                                          "'['", "']'", 
                                                          "'<'", "'>'", 
                                                          "'#'", "'@'", 
                                                          "'='", "' '", 
                                                          "'\t'", "','", 
                                                          "';'", "':'")
        private val SYMBOLIC_NAMES: List<String?> = listOf(null, "UUID_NAME", 
                                                           "LOCATION_NAME", 
                                                           "GEO_NAME", "TAGS_NAME", 
                                                           "UUID_VALUE", 
                                                           "DATE", "TS", 
                                                           "TS_TZ", "INT", 
                                                           "NUMBER", "ID", 
                                                           "SUBID", "QUOTE", 
                                                           "L_BRACE", "R_BRACE", 
                                                           "L_CURLY", "R_CURLY", 
                                                           "L_SQUARE", "R_SQUARE", 
                                                           "L_ANGLE", "R_ANGLE", 
                                                           "HASH", "AT", 
                                                           "EQUAL", "SPACE", 
                                                           "TAB", "COMMA", 
                                                           "SEMICOLON", 
                                                           "COLON", "NL", 
                                                           "ANYCHAR")

        val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0021\u0145\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0003\u0002\u0007\u0002\u0048\u000a\u0002\u000c\u0002\u000e\u0002\u004b\u000b\u0002\u0003\u0002\u0003\u0002\u0006\u0002\u004f\u000a\u0002\u000d\u0002\u000e\u0002\u0050\u0003\u0002\u0003\u0002\u0007\u0002\u0055\u000a\u0002\u000c\u0002\u000e\u0002\u0058\u000b\u0002\u0003\u0002\u0007\u0002\u005b\u000a\u0002\u000c\u0002\u000e\u0002\u005e\u000b\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0005\u0003\u0065\u000a\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0069\u000a\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u006d\u000a\u0003\u0003\u0003\u0007\u0003\u0070\u000a\u0003\u000c\u0003\u000e\u0003\u0073\u000b\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0007\u0006\u007f\u000a\u0006\u000c\u0006\u000e\u0006\u0082\u000b\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0007\u0008\u0089\u000a\u0008\u000c\u0008\u000e\u0008\u008c\u000b\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0006\u0009\u009d\u000a\u0009\u000d\u0009\u000e\u0009\u009e\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0005\u000d\u00c3\u000a\u000d\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0007\u0011\u00d4\u000a\u0011\u000c\u0011\u000e\u0011\u00d7\u000b\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0007\u0012\u00dc\u000a\u0012\u000c\u0012\u000e\u0012\u00df\u000b\u0012\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0013\u0003\u0014\u0006\u0014\u00e6\u000a\u0014\u000d\u0014\u000e\u0014\u00e7\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0006\u0016\u00ef\u000a\u0016\u000d\u0016\u000e\u0016\u00f0\u0003\u0016\u0003\u0016\u0005\u0016\u00f5\u000a\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u00fc\u000a\u0017\u0003\u0017\u0003\u0017\u0005\u0017\u0100\u000a\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0018\u0005\u0018\u0108\u000a\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0005\u0019\u010f\u000a\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001b\u0005\u001b\u0119\u000a\u001b\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001e\u0007\u001e\u012e\u000a\u001e\u000c\u001e\u000e\u001e\u0131\u000b\u001e\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0021\u0006\u0021\u0138\u000a\u0021\u000d\u0021\u000e\u0021\u0139\u0003\u0022\u0007\u0022\u013d\u000a\u0022\u000c\u0022\u000e\u0022\u0140\u000b\u0022\u0003\u0023\u0003\u0023\u0003\u0023\u0003\u0023\u0002\u0003\u0020\u0024\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0022\u0024\u0026\u0028\u002a\u002c\u002e\u0030\u0032\u0034\u0036\u0038\u003a\u003c\u003e\u0040\u0042\u0044\u0002\u0009\u0003\u0002\u0008\u000a\u0004\u0002\u000f\u0017\u0020\u0020\u0003\u0002\u0020\u0020\u0003\u0002\u000b\u000c\u0004\u0002\u000b\u000b\u000d\u000e\u0003\u0002\u001b\u001c\u0003\u0002\u0019\u001a\u0002\u013e\u0002\u0049\u0003\u0002\u0002\u0002\u0004\u0062\u0003\u0002\u0002\u0002\u0006\u0076\u0003\u0002\u0002\u0002\u0008\u0078\u0003\u0002\u0002\u0002\u000a\u0080\u0003\u0002\u0002\u0002\u000c\u0083\u0003\u0002\u0002\u0002\u000e\u008a\u0003\u0002\u0002\u0002\u0010\u009c\u0003\u0002\u0002\u0002\u0012\u00a0\u0003\u0002\u0002\u0002\u0014\u00a9\u0003\u0002\u0002\u0002\u0016\u00b2\u0003\u0002\u0002\u0002\u0018\u00bb\u0003\u0002\u0002\u0002\u001a\u00c4\u0003\u0002\u0002\u0002\u001c\u00c6\u0003\u0002\u0002\u0002\u001e\u00c8\u0003\u0002\u0002\u0002\u0020\u00ca\u0003\u0002\u0002\u0002\u0022\u00d8\u0003\u0002\u0002\u0002\u0024\u00e0\u0003\u0002\u0002\u0002\u0026\u00e5\u0003\u0002\u0002\u0002\u0028\u00e9\u0003\u0002\u0002\u0002\u002a\u00ee\u0003\u0002\u0002\u0002\u002c\u00f6\u0003\u0002\u0002\u0002\u002e\u0103\u0003\u0002\u0002\u0002\u0030\u010b\u0003\u0002\u0002\u0002\u0032\u0110\u0003\u0002\u0002\u0002\u0034\u0118\u0003\u0002\u0002\u0002\u0036\u011a\u0003\u0002\u0002\u0002\u0038\u0123\u0003\u0002\u0002\u0002\u003a\u012a\u0003\u0002\u0002\u0002\u003c\u0132\u0003\u0002\u0002\u0002\u003e\u0134\u0003\u0002\u0002\u0002\u0040\u0137\u0003\u0002\u0002\u0002\u0042\u013e\u0003\u0002\u0002\u0002\u0044\u0141\u0003\u0002\u0002\u0002\u0046\u0048\u0005\u0044\u0023\u0002\u0047\u0046\u0003\u0002\u0002\u0002\u0048\u004b\u0003\u0002\u0002\u0002\u0049\u0047\u0003\u0002\u0002\u0002\u0049\u004a\u0003\u0002\u0002\u0002\u004a\u004c\u0003\u0002\u0002\u0002\u004b\u0049\u0003\u0002\u0002\u0002\u004c\u0056\u0005\u0004\u0003\u0002\u004d\u004f\u0005\u0044\u0023\u0002\u004e\u004d\u0003\u0002\u0002\u0002\u004f\u0050\u0003\u0002\u0002\u0002\u0050\u004e\u0003\u0002\u0002\u0002\u0050\u0051\u0003\u0002\u0002\u0002\u0051\u0052\u0003\u0002\u0002\u0002\u0052\u0053\u0005\u0004\u0003\u0002\u0053\u0055\u0003\u0002\u0002\u0002\u0054\u004e\u0003\u0002\u0002\u0002\u0055\u0058\u0003\u0002\u0002\u0002\u0056\u0054\u0003\u0002\u0002\u0002\u0056\u0057\u0003\u0002\u0002\u0002\u0057\u005c\u0003\u0002\u0002\u0002\u0058\u0056\u0003\u0002\u0002\u0002\u0059\u005b\u0005\u0044\u0023\u0002\u005a\u0059\u0003\u0002\u0002\u0002\u005b\u005e\u0003\u0002\u0002\u0002\u005c\u005a\u0003\u0002\u0002\u0002\u005c\u005d\u0003\u0002\u0002\u0002\u005d\u005f\u0003\u0002\u0002\u0002\u005e\u005c\u0003\u0002\u0002\u0002\u005f\u0060\u0005\u0042\u0022\u0002\u0060\u0061\u0007\u0002\u0002\u0003\u0061\u0003\u0003\u0002\u0002\u0002\u0062\u0064\u0005\u0006\u0004\u0002\u0063\u0065\u0005\u0008\u0005\u0002\u0064\u0063\u0003\u0002\u0002\u0002\u0064\u0065\u0003\u0002\u0002\u0002\u0065\u0068\u0003\u0002\u0002\u0002\u0066\u0069\u0005\u000c\u0007\u0002\u0067\u0069\u0005\u0042\u0022\u0002\u0068\u0066\u0003\u0002\u0002\u0002\u0068\u0067\u0003\u0002\u0002\u0002\u0069\u006a\u0003\u0002\u0002\u0002\u006a\u006c\u0007\u0020\u0002\u0002\u006b\u006d\u0005\u0010\u0009\u0002\u006c\u006b\u0003\u0002\u0002\u0002\u006c\u006d\u0003\u0002\u0002\u0002\u006d\u0071\u0003\u0002\u0002\u0002\u006e\u0070\u0005\u0024\u0013\u0002\u006f\u006e\u0003\u0002\u0002\u0002\u0070\u0073\u0003\u0002\u0002\u0002\u0071\u006f\u0003\u0002\u0002\u0002\u0071\u0072\u0003\u0002\u0002\u0002\u0072\u0074\u0003\u0002\u0002\u0002\u0073\u0071\u0003\u0002\u0002\u0002\u0074\u0075\u0005\u002a\u0016\u0002\u0075\u0005\u0003\u0002\u0002\u0002\u0076\u0077\u0009\u0002\u0002\u0002\u0077\u0007\u0003\u0002\u0002\u0002\u0078\u0079\u0005\u0040\u0021\u0002\u0079\u007a\u0007\u0010\u0002\u0002\u007a\u007b\u0005\u000a\u0006\u0002\u007b\u007c\u0007\u0011\u0002\u0002\u007c\u0009\u0003\u0002\u0002\u0002\u007d\u007f\u000a\u0003\u0002\u0002\u007e\u007d\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u000b\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0083\u0084\u0005\u0040\u0021\u0002\u0084\u0085\u0007\u000f\u0002\u0002\u0085\u0086\u0005\u000e\u0008\u0002\u0086\u000d\u0003\u0002\u0002\u0002\u0087\u0089\u000a\u0004\u0002\u0002\u0088\u0087\u0003\u0002\u0002\u0002\u0089\u008c\u0003\u0002\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u000f\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008d\u008e\u0006\u0009\u0002\u0003\u008e\u008f\u0005\u0012\u000a\u0002\u008f\u0090\u0007\u0020\u0002\u0002\u0090\u0091\u0008\u0009\u0001\u0002\u0091\u009d\u0003\u0002\u0002\u0002\u0092\u0093\u0006\u0009\u0003\u0003\u0093\u0094\u0005\u0014\u000b\u0002\u0094\u0095\u0007\u0020\u0002\u0002\u0095\u0096\u0008\u0009\u0001\u0002\u0096\u009d\u0003\u0002\u0002\u0002\u0097\u0098\u0006\u0009\u0004\u0003\u0098\u0099\u0005\u0016\u000c\u0002\u0099\u009a\u0007\u0020\u0002\u0002\u009a\u009b\u0008\u0009\u0001\u0002\u009b\u009d\u0003\u0002\u0002\u0002\u009c\u008d\u0003\u0002\u0002\u0002\u009c\u0092\u0003\u0002\u0002\u0002\u009c\u0097\u0003\u0002\u0002\u0002\u009d\u009e\u0003\u0002\u0002\u0002\u009e\u009c\u0003\u0002\u0002\u0002\u009e\u009f\u0003\u0002\u0002\u0002\u009f\u0011\u0003\u0002\u0002\u0002\u00a0\u00a1\u0005\u0026\u0014\u0002\u00a1\u00a2\u0007\u0018\u0002\u0002\u00a2\u00a3\u0005\u0040\u0021\u0002\u00a3\u00a4\u0007\u0003\u0002\u0002\u00a4\u00a5\u0007\u001f\u0002\u0002\u00a5\u00a6\u0005\u0040\u0021\u0002\u00a6\u00a7\u0007\u0007\u0002\u0002\u00a7\u00a8\u0005\u0042\u0022\u0002\u00a8\u0013\u0003\u0002\u0002\u0002\u00a9\u00aa\u0005\u0026\u0014\u0002\u00aa\u00ab\u0007\u0018\u0002\u0002\u00ab\u00ac\u0005\u0040\u0021\u0002\u00ac\u00ad\u0007\u0004\u0002\u0002\u00ad\u00ae\u0007\u001f\u0002\u0002\u00ae\u00af\u0005\u0040\u0021\u0002\u00af\u00b0\u0005\u0018\u000d\u0002\u00b0\u00b1\u0005\u0042\u0022\u0002\u00b1\u0015\u0003\u0002\u0002\u0002\u00b2\u00b3\u0005\u0026\u0014\u0002\u00b3\u00b4\u0007\u0018\u0002\u0002\u00b4\u00b5\u0005\u0040\u0021\u0002\u00b5\u00b6\u0007\u0006\u0002\u0002\u00b6\u00b7\u0007\u001f\u0002\u0002\u00b7\u00b8\u0005\u0040\u0021\u0002\u00b8\u00b9\u0005\u0020\u0011\u0002\u00b9\u00ba\u0005\u0042\u0022\u0002\u00ba\u0017\u0003\u0002\u0002\u0002\u00bb\u00bc\u0007\u0005\u0002\u0002\u00bc\u00bd\u0007\u001f\u0002\u0002\u00bd\u00be\u0005\u001a\u000e\u0002\u00be\u00bf\u0007\u001d\u0002\u0002\u00bf\u00c2\u0005\u001c\u000f\u0002\u00c0\u00c1\u0007\u001d\u0002\u0002\u00c1\u00c3\u0005\u001e\u0010\u0002\u00c2\u00c0\u0003\u0002\u0002\u0002\u00c2\u00c3\u0003\u0002\u0002\u0002\u00c3\u0019\u0003\u0002\u0002\u0002\u00c4\u00c5\u0009\u0005\u0002\u0002\u00c5\u001b\u0003\u0002\u0002\u0002\u00c6\u00c7\u0009\u0005\u0002\u0002\u00c7\u001d\u0003\u0002\u0002\u0002\u00c8\u00c9\u0009\u0005\u0002\u0002\u00c9\u001f\u0003\u0002\u0002\u0002\u00ca\u00cb\u0008\u0011\u0001\u0002\u00cb\u00cc\u0005\u0022\u0012\u0002\u00cc\u00d5\u0003\u0002\u0002\u0002\u00cd\u00ce\u000c\u0003\u0002\u0002\u00ce\u00cf\u0005\u0042\u0022\u0002\u00cf\u00d0\u0007\u001d\u0002\u0002\u00d0\u00d1\u0005\u0042\u0022\u0002\u00d1\u00d2\u0005\u0022\u0012\u0002\u00d2\u00d4\u0003\u0002\u0002\u0002\u00d3\u00cd\u0003\u0002\u0002\u0002\u00d4\u00d7\u0003\u0002\u0002\u0002\u00d5\u00d3\u0003\u0002\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u0021\u0003\u0002\u0002\u0002\u00d7\u00d5\u0003\u0002\u0002\u0002\u00d8\u00dd\u0007\u000d\u0002\u0002\u00d9\u00da\u0007\u001f\u0002\u0002\u00da\u00dc\u0009\u0006\u0002\u0002\u00db\u00d9\u0003\u0002\u0002\u0002\u00dc\u00df\u0003\u0002\u0002\u0002\u00dd\u00db\u0003\u0002\u0002\u0002\u00dd\u00de\u0003\u0002\u0002\u0002\u00de\u0023\u0003\u0002\u0002\u0002\u00df\u00dd\u0003\u0002\u0002\u0002\u00e0\u00e1\u0005\u0026\u0014\u0002\u00e1\u00e2\u0005\u0028\u0015\u0002\u00e2\u00e3\u0007\u0020\u0002\u0002\u00e3\u0025\u0003\u0002\u0002\u0002\u00e4\u00e6\u0009\u0007\u0002\u0002\u00e5\u00e4\u0003\u0002\u0002\u0002\u00e6\u00e7\u0003\u0002\u0002\u0002\u00e7\u00e5\u0003\u0002\u0002\u0002\u00e7\u00e8\u0003\u0002\u0002\u0002\u00e8\u0027\u0003\u0002\u0002\u0002\u00e9\u00ea\u0007\u001e\u0002\u0002\u00ea\u00eb\u0007\u001b\u0002\u0002\u00eb\u00ec\u0005\u000e\u0008\u0002\u00ec\u0029\u0003\u0002\u0002\u0002\u00ed\u00ef\u0005\u002c\u0017\u0002\u00ee\u00ed\u0003\u0002\u0002\u0002\u00ef\u00f0\u0003\u0002\u0002\u0002\u00f0\u00ee\u0003\u0002\u0002\u0002\u00f0\u00f1\u0003\u0002\u0002\u0002\u00f1\u00f4\u0003\u0002\u0002\u0002\u00f2\u00f5\u0005\u002c\u0017\u0002\u00f3\u00f5\u0005\u002e\u0018\u0002\u00f4\u00f2\u0003\u0002\u0002\u0002\u00f4\u00f3\u0003\u0002\u0002\u0002\u00f5\u002b\u0003\u0002\u0002\u0002\u00f6\u00f7\u0005\u0026\u0014\u0002\u00f7\u00f8\u0005\u003a\u001e\u0002\u00f8\u00f9\u0005\u0040\u0021\u0002\u00f9\u00fb\u0005\u003c\u001f\u0002\u00fa\u00fc\u0005\u0030\u0019\u0002\u00fb\u00fa\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u00ff\u0003\u0002\u0002\u0002\u00fd\u0100\u0005\u0032\u001a\u0002\u00fe\u0100\u0005\u0042\u0022\u0002\u00ff\u00fd\u0003\u0002\u0002\u0002\u00ff\u00fe\u0003\u0002\u0002\u0002\u0100\u0101\u0003\u0002\u0002\u0002\u0101\u0102\u0007\u0020\u0002\u0002\u0102\u002d\u0003\u0002\u0002\u0002\u0103\u0104\u0005\u0026\u0014\u0002\u0104\u0107\u0005\u003a\u001e\u0002\u0105\u0108\u0005\u0032\u001a\u0002\u0106\u0108\u0005\u0042\u0022\u0002\u0107\u0105\u0003\u0002\u0002\u0002\u0107\u0106\u0003\u0002\u0002\u0002\u0108\u0109\u0003\u0002\u0002\u0002\u0109\u010a\u0007\u0020\u0002\u0002\u010a\u002f\u0003\u0002\u0002\u0002\u010b\u010c\u0005\u0040\u0021\u0002\u010c\u010e\u0005\u003e\u0020\u0002\u010d\u010f\u0005\u0034\u001b\u0002\u010e\u010d\u0003\u0002\u0002\u0002\u010e\u010f\u0003\u0002\u0002\u0002\u010f\u0031\u0003\u0002\u0002\u0002\u0110\u0111\u0005\u0042\u0022\u0002\u0111\u0112\u0005\u0028\u0015\u0002\u0112\u0033\u0003\u0002\u0002\u0002\u0113\u0119\u0005\u0036\u001c\u0002\u0114\u0115\u0005\u0036\u001c\u0002\u0115\u0116\u0005\u0038\u001d\u0002\u0116\u0119\u0003\u0002\u0002\u0002\u0117\u0119\u0005\u0038\u001d\u0002\u0118\u0113\u0003\u0002\u0002\u0002\u0118\u0114\u0003\u0002\u0002\u0002\u0118\u0117\u0003\u0002\u0002\u0002\u0119\u0035\u0003\u0002\u0002\u0002\u011a\u011b\u0005\u0040\u0021\u0002\u011b\u011c\u0007\u0012\u0002\u0002\u011c\u011d\u0005\u0042\u0022\u0002\u011d\u011e\u0005\u003c\u001f\u0002\u011e\u011f\u0005\u0040\u0021\u0002\u011f\u0120\u0005\u003e\u0020\u0002\u0120\u0121\u0005\u0042\u0022\u0002\u0121\u0122\u0007\u0013\u0002\u0002\u0122\u0037\u0003\u0002\u0002\u0002\u0123\u0124\u0005\u0040\u0021\u0002\u0124\u0125\u0009\u0008\u0002\u0002\u0125\u0126\u0005\u0040\u0021\u0002\u0126\u0127\u0005\u003c\u001f\u0002\u0127\u0128\u0005\u0040\u0021\u0002\u0128\u0129\u0005\u003e\u0020\u0002\u0129\u0039\u0003\u0002\u0002\u0002\u012a\u012f\u0007\u000d\u0002\u0002\u012b\u012c\u0007\u001f\u0002\u0002\u012c\u012e\u0009\u0006\u0002\u0002\u012d\u012b\u0003\u0002\u0002\u0002\u012e\u0131\u0003\u0002\u0002\u0002\u012f\u012d\u0003\u0002\u0002\u0002\u012f\u0130\u0003\u0002\u0002\u0002\u0130\u003b\u0003\u0002\u0002\u0002\u0131\u012f\u0003\u0002\u0002\u0002\u0132\u0133\u0009\u0005\u0002\u0002\u0133\u003d\u0003\u0002\u0002\u0002\u0134\u0135\u0007\u000d\u0002\u0002\u0135\u003f\u0003\u0002\u0002\u0002\u0136\u0138\u0009\u0007\u0002\u0002\u0137\u0136\u0003\u0002\u0002\u0002\u0138\u0139\u0003\u0002\u0002\u0002\u0139\u0137\u0003\u0002\u0002\u0002\u0139\u013a\u0003\u0002\u0002\u0002\u013a\u0041\u0003\u0002\u0002\u0002\u013b\u013d\u0009\u0007\u0002\u0002\u013c\u013b\u0003\u0002\u0002\u0002\u013d\u0140\u0003\u0002\u0002\u0002\u013e\u013c\u0003\u0002\u0002\u0002\u013e\u013f\u0003\u0002\u0002\u0002\u013f\u0043\u0003\u0002\u0002\u0002\u0140\u013e\u0003\u0002\u0002\u0002\u0141\u0142\u0005\u0042\u0022\u0002\u0142\u0143\u0007\u0020\u0002\u0002\u0143\u0045\u0003\u0002\u0002\u0002\u001c\u0049\u0050\u0056\u005c\u0064\u0068\u006c\u0071\u0080\u008a\u009c\u009e\u00c2\u00d5\u00dd\u00e7\u00f0\u00f4\u00fb\u00ff\u0107\u010e\u0118\u012f\u0139\u013e"

        val ATN = ATNDeserializer().deserialize(serializedATN.asCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val UUID_NAME = Tokens.UUID_NAME.id
    private val LOCATION_NAME = Tokens.LOCATION_NAME.id
    private val GEO_NAME = Tokens.GEO_NAME.id
    private val TAGS_NAME = Tokens.TAGS_NAME.id
    private val UUID_VALUE = Tokens.UUID_VALUE.id
    private val DATE = Tokens.DATE.id
    private val TS = Tokens.TS.id
    private val TS_TZ = Tokens.TS_TZ.id
    private val INT = Tokens.INT.id
    private val NUMBER = Tokens.NUMBER.id
    private val ID = Tokens.ID.id
    private val SUBID = Tokens.SUBID.id
    private val QUOTE = Tokens.QUOTE.id
    private val L_BRACE = Tokens.L_BRACE.id
    private val R_BRACE = Tokens.R_BRACE.id
    private val L_CURLY = Tokens.L_CURLY.id
    private val R_CURLY = Tokens.R_CURLY.id
    private val L_SQUARE = Tokens.L_SQUARE.id
    private val R_SQUARE = Tokens.R_SQUARE.id
    private val L_ANGLE = Tokens.L_ANGLE.id
    private val R_ANGLE = Tokens.R_ANGLE.id
    private val HASH = Tokens.HASH.id
    private val AT = Tokens.AT.id
    private val EQUAL = Tokens.EQUAL.id
    private val SPACE = Tokens.SPACE.id
    private val TAB = Tokens.TAB.id
    private val COMMA = Tokens.COMMA.id
    private val SEMICOLON = Tokens.SEMICOLON.id
    private val COLON = Tokens.COLON.id
    private val NL = Tokens.NL.id
    private val ANYCHAR = Tokens.ANYCHAR.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class TxnsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txns.id
	        set(value) { throw RuntimeException() }
		fun findTxn() : List<TxnContext> = getRuleContexts(solver.getType("TxnContext"))
		fun findTxn(i: Int) : TxnContext? = getRuleContext(solver.getType("TxnContext"),i)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		fun EOF() : TerminalNode? = getToken(TxnParser.Tokens.EOF.id, 0)
		fun findBlankline() : List<BlanklineContext> = getRuleContexts(solver.getType("BlanklineContext"))
		fun findBlankline(i: Int) : BlanklineContext? = getRuleContext(solver.getType("BlanklineContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxns(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxns(this)
		}
	}

	fun  txns() : TxnsContext {
		var _localctx : TxnsContext = TxnsContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_txns.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 71
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl SPACE) or (1L shl TAB) or (1L shl NL))) != 0L)) {
				if (true){
				if (true){
				this.state = 68
				blankline()
				}
				}
				this.state = 73
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 74
			txn()
			this.state = 84
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,2,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 76 
					errorHandler.sync(this)
					_la = _input!!.LA(1)
					do {
						if (true){
						if (true){
						this.state = 75
						blankline()
						}
						}
						this.state = 78 
						errorHandler.sync(this)
						_la = _input!!.LA(1)
					} while ( (((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl SPACE) or (1L shl TAB) or (1L shl NL))) != 0L) )
					this.state = 80
					txn()
					}
					} 
				}
				this.state = 86
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,2,context)
			}
			this.state = 90
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,3,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 87
					blankline()
					}
					} 
				}
				this.state = 92
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,3,context)
			}
			this.state = 93
			opt_sp()
			this.state = 94
			match(EOF) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TxnContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txn.id
	        set(value) { throw RuntimeException() }
		fun findDate() : DateContext? = getRuleContext(solver.getType("DateContext"),0)
		fun NL() : TerminalNode? = getToken(TxnParser.Tokens.NL.id, 0)
		fun findPostings() : PostingsContext? = getRuleContext(solver.getType("PostingsContext"),0)
		fun findDescription() : DescriptionContext? = getRuleContext(solver.getType("DescriptionContext"),0)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		fun findCode() : CodeContext? = getRuleContext(solver.getType("CodeContext"),0)
		fun findTxn_meta() : Txn_metaContext? = getRuleContext(solver.getType("Txn_metaContext"),0)
		fun findTxn_comment() : List<Txn_commentContext> = getRuleContexts(solver.getType("Txn_commentContext"))
		fun findTxn_comment(i: Int) : Txn_commentContext? = getRuleContext(solver.getType("Txn_commentContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxn(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxn(this)
		}
	}

	fun  txn() : TxnContext {
		var _localctx : TxnContext = TxnContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_txn.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 96
			date()
			this.state = 98
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1   -> if (true){
			this.state = 97
			code()
			}
			}
			this.state = 102
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {if (true){
			this.state = 100
			description()
			}}
			2 -> {if (true){
			this.state = 101
			opt_sp()
			}}
			}
			this.state = 104
			match(NL) as Token
			this.state = 106
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,6,context) ) {
			1   -> if (true){
			this.state = 105
			txn_meta(0, 0, 0)
			}
			}
			this.state = 111
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,7,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 108
					txn_comment()
					}
					} 
				}
				this.state = 113
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,7,context)
			}
			this.state = 114
			postings()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DateContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_date.id
	        set(value) { throw RuntimeException() }
		fun DATE() : TerminalNode? = getToken(TxnParser.Tokens.DATE.id, 0)
		fun TS() : TerminalNode? = getToken(TxnParser.Tokens.TS.id, 0)
		fun TS_TZ() : TerminalNode? = getToken(TxnParser.Tokens.TS_TZ.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterDate(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitDate(this)
		}
	}

	fun  date() : DateContext {
		var _localctx : DateContext = DateContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_date.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 116
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl DATE) or (1L shl TS) or (1L shl TS_TZ))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CodeContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_code.id
	        set(value) { throw RuntimeException() }
		fun findSp() : SpContext? = getRuleContext(solver.getType("SpContext"),0)
		fun findCode_value() : Code_valueContext? = getRuleContext(solver.getType("Code_valueContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterCode(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitCode(this)
		}
	}

	fun  code() : CodeContext {
		var _localctx : CodeContext = CodeContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_code.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 118
			sp()
			this.state = 119
			match(L_BRACE) as Token
			this.state = 120
			code_value()
			this.state = 121
			match(R_BRACE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Code_valueContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_code_value.id
	        set(value) { throw RuntimeException() }
		fun NL() : List<TerminalNode> = getTokens(TxnParser.Tokens.NL.id)
		fun NL(i: Int) : TerminalNode = getToken(TxnParser.Tokens.NL.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterCode_value(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitCode_value(this)
		}
	}

	fun  code_value() : Code_valueContext {
		var _localctx : Code_valueContext = Code_valueContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_code_value.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 126
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl UUID_NAME) or (1L shl LOCATION_NAME) or (1L shl GEO_NAME) or (1L shl TAGS_NAME) or (1L shl UUID_VALUE) or (1L shl DATE) or (1L shl TS) or (1L shl TS_TZ) or (1L shl INT) or (1L shl NUMBER) or (1L shl ID) or (1L shl SUBID) or (1L shl HASH) or (1L shl AT) or (1L shl EQUAL) or (1L shl SPACE) or (1L shl TAB) or (1L shl COMMA) or (1L shl SEMICOLON) or (1L shl COLON) or (1L shl ANYCHAR))) != 0L)) {
				if (true){
				if (true){
				this.state = 123
				_la = _input!!.LA(1)
				if ( _la <= 0 || ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl QUOTE) or (1L shl L_BRACE) or (1L shl R_BRACE) or (1L shl L_CURLY) or (1L shl R_CURLY) or (1L shl L_SQUARE) or (1L shl R_SQUARE) or (1L shl L_ANGLE) or (1L shl R_ANGLE) or (1L shl NL))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 128
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DescriptionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_description.id
	        set(value) { throw RuntimeException() }
		fun findSp() : SpContext? = getRuleContext(solver.getType("SpContext"),0)
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterDescription(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitDescription(this)
		}
	}

	fun  description() : DescriptionContext {
		var _localctx : DescriptionContext = DescriptionContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_description.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 129
			sp()
			this.state = 130
			match(QUOTE) as Token
			this.state = 131
			text()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TextContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_text.id
	        set(value) { throw RuntimeException() }
		fun NL() : List<TerminalNode> = getTokens(TxnParser.Tokens.NL.id)
		fun NL(i: Int) : TerminalNode = getToken(TxnParser.Tokens.NL.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterText(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitText(this)
		}
	}

	fun  text() : TextContext {
		var _localctx : TextContext = TextContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_text.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 136
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl UUID_NAME) or (1L shl LOCATION_NAME) or (1L shl GEO_NAME) or (1L shl TAGS_NAME) or (1L shl UUID_VALUE) or (1L shl DATE) or (1L shl TS) or (1L shl TS_TZ) or (1L shl INT) or (1L shl NUMBER) or (1L shl ID) or (1L shl SUBID) or (1L shl QUOTE) or (1L shl L_BRACE) or (1L shl R_BRACE) or (1L shl L_CURLY) or (1L shl R_CURLY) or (1L shl L_SQUARE) or (1L shl R_SQUARE) or (1L shl L_ANGLE) or (1L shl R_ANGLE) or (1L shl HASH) or (1L shl AT) or (1L shl EQUAL) or (1L shl SPACE) or (1L shl TAB) or (1L shl COMMA) or (1L shl SEMICOLON) or (1L shl COLON) or (1L shl ANYCHAR))) != 0L)) {
				if (true){
				if (true){
				this.state = 133
				_la = _input!!.LA(1)
				if ( _la <= 0 || (_la==NL) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 138
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Txn_metaContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txn_meta.id
	        set(value) { throw RuntimeException() }
		var u : int
		var l : int
		var t : int
		fun findTxn_meta_uuid() : List<Txn_meta_uuidContext> = getRuleContexts(solver.getType("Txn_meta_uuidContext"))
		fun findTxn_meta_uuid(i: Int) : Txn_meta_uuidContext? = getRuleContext(solver.getType("Txn_meta_uuidContext"),i)
		fun NL() : List<TerminalNode> = getTokens(TxnParser.Tokens.NL.id)
		fun NL(i: Int) : TerminalNode = getToken(TxnParser.Tokens.NL.id, i) as TerminalNode
		fun findTxn_meta_location() : List<Txn_meta_locationContext> = getRuleContexts(solver.getType("Txn_meta_locationContext"))
		fun findTxn_meta_location(i: Int) : Txn_meta_locationContext? = getRuleContext(solver.getType("Txn_meta_locationContext"),i)
		fun findTxn_meta_tags() : List<Txn_meta_tagsContext> = getRuleContexts(solver.getType("Txn_meta_tagsContext"))
		fun findTxn_meta_tags(i: Int) : Txn_meta_tagsContext? = getRuleContext(solver.getType("Txn_meta_tagsContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){ ; }
		constructor(parent: ParserRuleContext?, invokingState: Int, var u : int, var l : int, var t : int) : super(parent, invokingState){
			this.u = u;
			this.l = l;
			this.t = t;
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxn_meta(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxn_meta(this)
		}
	}

	fun  txn_meta(var u : int,var l : int,var t : int) : Txn_metaContext {
		var _localctx : Txn_metaContext = Txn_metaContext(context, state, u, l, t)
		enterRule(_localctx, 14, Rules.RULE_txn_meta.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 154 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				this.state = 154
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
				1 -> {if (true){
				this.state = 139
				if (!(_localctx.u < 1)) throw FailedPredicateException(this, "$u < 1")
				this.state = 140
				txn_meta_uuid()
				this.state = 141
				match(NL) as Token
				_localctx.u++;
				}}
				2 -> {if (true){
				this.state = 144
				if (!(_localctx.l < 1)) throw FailedPredicateException(this, "$l < 1")
				this.state = 145
				txn_meta_location()
				this.state = 146
				match(NL) as Token
				_localctx.l++;
				}}
				3 -> {if (true){
				this.state = 149
				if (!(_localctx.t < 1)) throw FailedPredicateException(this, "$t < 1")
				this.state = 150
				txn_meta_tags()
				this.state = 151
				match(NL) as Token
				_localctx.t++;
				}}
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 156 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,11,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Txn_meta_uuidContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txn_meta_uuid.id
	        set(value) { throw RuntimeException() }
		fun findIndent() : IndentContext? = getRuleContext(solver.getType("IndentContext"),0)
		fun findSp() : List<SpContext> = getRuleContexts(solver.getType("SpContext"))
		fun findSp(i: Int) : SpContext? = getRuleContext(solver.getType("SpContext"),i)
		fun UUID_NAME() : TerminalNode? = getToken(TxnParser.Tokens.UUID_NAME.id, 0)
		fun UUID_VALUE() : TerminalNode? = getToken(TxnParser.Tokens.UUID_VALUE.id, 0)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxn_meta_uuid(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxn_meta_uuid(this)
		}
	}

	fun  txn_meta_uuid() : Txn_meta_uuidContext {
		var _localctx : Txn_meta_uuidContext = Txn_meta_uuidContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_txn_meta_uuid.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 158
			indent()
			this.state = 159
			match(HASH) as Token
			this.state = 160
			sp()
			this.state = 161
			match(UUID_NAME) as Token
			this.state = 162
			match(COLON) as Token
			this.state = 163
			sp()
			this.state = 164
			match(UUID_VALUE) as Token
			this.state = 165
			opt_sp()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Txn_meta_locationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txn_meta_location.id
	        set(value) { throw RuntimeException() }
		fun findIndent() : IndentContext? = getRuleContext(solver.getType("IndentContext"),0)
		fun findSp() : List<SpContext> = getRuleContexts(solver.getType("SpContext"))
		fun findSp(i: Int) : SpContext? = getRuleContext(solver.getType("SpContext"),i)
		fun LOCATION_NAME() : TerminalNode? = getToken(TxnParser.Tokens.LOCATION_NAME.id, 0)
		fun findGeo_uri() : Geo_uriContext? = getRuleContext(solver.getType("Geo_uriContext"),0)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxn_meta_location(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxn_meta_location(this)
		}
	}

	fun  txn_meta_location() : Txn_meta_locationContext {
		var _localctx : Txn_meta_locationContext = Txn_meta_locationContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_txn_meta_location.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 167
			indent()
			this.state = 168
			match(HASH) as Token
			this.state = 169
			sp()
			this.state = 170
			match(LOCATION_NAME) as Token
			this.state = 171
			match(COLON) as Token
			this.state = 172
			sp()
			this.state = 173
			geo_uri()
			this.state = 174
			opt_sp()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Txn_meta_tagsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txn_meta_tags.id
	        set(value) { throw RuntimeException() }
		fun findIndent() : IndentContext? = getRuleContext(solver.getType("IndentContext"),0)
		fun findSp() : List<SpContext> = getRuleContexts(solver.getType("SpContext"))
		fun findSp(i: Int) : SpContext? = getRuleContext(solver.getType("SpContext"),i)
		fun TAGS_NAME() : TerminalNode? = getToken(TxnParser.Tokens.TAGS_NAME.id, 0)
		fun findTags() : TagsContext? = getRuleContext(solver.getType("TagsContext"),0)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxn_meta_tags(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxn_meta_tags(this)
		}
	}

	fun  txn_meta_tags() : Txn_meta_tagsContext {
		var _localctx : Txn_meta_tagsContext = Txn_meta_tagsContext(context, state)
		enterRule(_localctx, 20, Rules.RULE_txn_meta_tags.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 176
			indent()
			this.state = 177
			match(HASH) as Token
			this.state = 178
			sp()
			this.state = 179
			match(TAGS_NAME) as Token
			this.state = 180
			match(COLON) as Token
			this.state = 181
			sp()
			this.state = 182
			tags(0)
			this.state = 183
			opt_sp()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Geo_uriContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_geo_uri.id
	        set(value) { throw RuntimeException() }
		fun GEO_NAME() : TerminalNode? = getToken(TxnParser.Tokens.GEO_NAME.id, 0)
		fun findLat() : LatContext? = getRuleContext(solver.getType("LatContext"),0)
		fun findLon() : LonContext? = getRuleContext(solver.getType("LonContext"),0)
		fun findAlt() : AltContext? = getRuleContext(solver.getType("AltContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterGeo_uri(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitGeo_uri(this)
		}
	}

	fun  geo_uri() : Geo_uriContext {
		var _localctx : Geo_uriContext = Geo_uriContext(context, state)
		enterRule(_localctx, 22, Rules.RULE_geo_uri.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 185
			match(GEO_NAME) as Token
			this.state = 186
			match(COLON) as Token
			this.state = 187
			lat()
			this.state = 188
			match(COMMA) as Token
			this.state = 189
			lon()
			this.state = 192
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==COMMA) {
				if (true){
				this.state = 190
				match(COMMA) as Token
				this.state = 191
				alt()
				}
			}

			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LatContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lat.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(TxnParser.Tokens.INT.id, 0)
		fun NUMBER() : TerminalNode? = getToken(TxnParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterLat(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitLat(this)
		}
	}

	fun  lat() : LatContext {
		var _localctx : LatContext = LatContext(context, state)
		enterRule(_localctx, 24, Rules.RULE_lat.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 194
			_la = _input!!.LA(1)
			if ( !(_la==INT || _la==NUMBER) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class LonContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_lon.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(TxnParser.Tokens.INT.id, 0)
		fun NUMBER() : TerminalNode? = getToken(TxnParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterLon(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitLon(this)
		}
	}

	fun  lon() : LonContext {
		var _localctx : LonContext = LonContext(context, state)
		enterRule(_localctx, 26, Rules.RULE_lon.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 196
			_la = _input!!.LA(1)
			if ( !(_la==INT || _la==NUMBER) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AltContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_alt.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(TxnParser.Tokens.INT.id, 0)
		fun NUMBER() : TerminalNode? = getToken(TxnParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterAlt(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitAlt(this)
		}
	}

	fun  alt() : AltContext {
		var _localctx : AltContext = AltContext(context, state)
		enterRule(_localctx, 28, Rules.RULE_alt.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 198
			_la = _input!!.LA(1)
			if ( !(_la==INT || _la==NUMBER) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class TagsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tags.id
	        set(value) { throw RuntimeException() }
		fun findTag() : TagContext? = getRuleContext(solver.getType("TagContext"),0)
		fun findTags() : TagsContext? = getRuleContext(solver.getType("TagsContext"),0)
		fun findOpt_sp() : List<Opt_spContext> = getRuleContexts(solver.getType("Opt_spContext"))
		fun findOpt_sp(i: Int) : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTags(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTags(this)
		}
	}

	 fun tags() : TagsContext {
		return tags(0);
	}

	private fun tags(_p: Int) : TagsContext {
		var _parentctx : ParserRuleContext? = context
		var _parentState : Int = state
		var _localctx : TagsContext= TagsContext(context, _parentState)
		var _prevctx : TagsContext= _localctx
		var _startState : Int = 30
		enterRecursionRule(_localctx, 30, Rules.RULE_tags.id, _p)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			if (true){
			this.state = 201
			tag()
			}
			this.context!!.stop = _input!!.LT(-1)
			this.state = 211
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,13,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent()
					    _prevctx = _localctx
					if (true){
					if (true){
					_localctx = TagsContext(_parentctx, _parentState)
					pushNewRecursionContext(_localctx, _startState, Rules.RULE_tags.id)
					this.state = 203
					if (!(precpred(context!!, 1))) throw FailedPredicateException(this, "precpred(context!!, 1)")
					this.state = 204
					opt_sp()
					this.state = 205
					match(COMMA) as Token
					this.state = 206
					opt_sp()
					this.state = 207
					tag()
					}
					} 
				}
				this.state = 213
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,13,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			unrollRecursionContexts(_parentctx)
		}
		return _localctx
	}

	open class TagContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_tag.id
	        set(value) { throw RuntimeException() }
		fun ID() : List<TerminalNode> = getTokens(TxnParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(TxnParser.Tokens.ID.id, i) as TerminalNode
		fun SUBID() : List<TerminalNode> = getTokens(TxnParser.Tokens.SUBID.id)
		fun SUBID(i: Int) : TerminalNode = getToken(TxnParser.Tokens.SUBID.id, i) as TerminalNode
		fun INT() : List<TerminalNode> = getTokens(TxnParser.Tokens.INT.id)
		fun INT(i: Int) : TerminalNode = getToken(TxnParser.Tokens.INT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTag(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTag(this)
		}
	}

	fun  tag() : TagContext {
		var _localctx : TagContext = TagContext(context, state)
		enterRule(_localctx, 32, Rules.RULE_tag.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 214
			match(ID) as Token
			this.state = 219
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 215
					match(COLON) as Token
					this.state = 216
					_la = _input!!.LA(1)
					if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl ID) or (1L shl SUBID))) != 0L)) ) {
						errorHandler.recoverInline(this)
					}
					else {
						if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
						errorHandler.reportMatch(this)
						consume()
					}
					}
					} 
				}
				this.state = 221
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Txn_commentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_txn_comment.id
	        set(value) { throw RuntimeException() }
		fun findIndent() : IndentContext? = getRuleContext(solver.getType("IndentContext"),0)
		fun findComment() : CommentContext? = getRuleContext(solver.getType("CommentContext"),0)
		fun NL() : TerminalNode? = getToken(TxnParser.Tokens.NL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterTxn_comment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitTxn_comment(this)
		}
	}

	fun  txn_comment() : Txn_commentContext {
		var _localctx : Txn_commentContext = Txn_commentContext(context, state)
		enterRule(_localctx, 34, Rules.RULE_txn_comment.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 222
			indent()
			this.state = 223
			comment()
			this.state = 224
			match(NL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IndentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_indent.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterIndent(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitIndent(this)
		}
	}

	fun  indent() : IndentContext {
		var _localctx : IndentContext = IndentContext(context, state)
		enterRule(_localctx, 36, Rules.RULE_indent.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 227 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 226
				_la = _input!!.LA(1)
				if ( !(_la==SPACE || _la==TAB) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 229 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==SPACE || _la==TAB )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class CommentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_comment.id
	        set(value) { throw RuntimeException() }
		fun findText() : TextContext? = getRuleContext(solver.getType("TextContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterComment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitComment(this)
		}
	}

	fun  comment() : CommentContext {
		var _localctx : CommentContext = CommentContext(context, state)
		enterRule(_localctx, 38, Rules.RULE_comment.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 231
			match(SEMICOLON) as Token
			this.state = 232
			match(SPACE) as Token
			this.state = 233
			text()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PostingsContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_postings.id
	        set(value) { throw RuntimeException() }
		fun findPosting() : List<PostingContext> = getRuleContexts(solver.getType("PostingContext"))
		fun findPosting(i: Int) : PostingContext? = getRuleContext(solver.getType("PostingContext"),i)
		fun findLast_posting() : Last_postingContext? = getRuleContext(solver.getType("Last_postingContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterPostings(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitPostings(this)
		}
	}

	fun  postings() : PostingsContext {
		var _localctx : PostingsContext = PostingsContext(context, state)
		enterRule(_localctx, 40, Rules.RULE_postings.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 236 
			errorHandler.sync(this)
			_alt = 1
			do {
				when (_alt) {
				    1 -> if (true){
				if (true){
				this.state = 235
				posting()
				}
				}
				else -> throw NoViableAltException(this)
				}
				this.state = 238 
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,16,context)
			} while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER )
			this.state = 242
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,17,context) ) {
			1 -> {if (true){
			this.state = 240
			posting()
			}}
			2 -> {if (true){
			this.state = 241
			last_posting()
			}}
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PostingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_posting.id
	        set(value) { throw RuntimeException() }
		fun findIndent() : IndentContext? = getRuleContext(solver.getType("IndentContext"),0)
		fun findAccount() : AccountContext? = getRuleContext(solver.getType("AccountContext"),0)
		fun findSp() : SpContext? = getRuleContext(solver.getType("SpContext"),0)
		fun findAmount() : AmountContext? = getRuleContext(solver.getType("AmountContext"),0)
		fun NL() : TerminalNode? = getToken(TxnParser.Tokens.NL.id, 0)
		fun findOpt_comment() : Opt_commentContext? = getRuleContext(solver.getType("Opt_commentContext"),0)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		fun findOpt_unit() : Opt_unitContext? = getRuleContext(solver.getType("Opt_unitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterPosting(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitPosting(this)
		}
	}

	fun  posting() : PostingContext {
		var _localctx : PostingContext = PostingContext(context, state)
		enterRule(_localctx, 42, Rules.RULE_posting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 244
			indent()
			this.state = 245
			account()
			this.state = 246
			sp()
			this.state = 247
			amount()
			this.state = 249
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,18,context) ) {
			1   -> if (true){
			this.state = 248
			opt_unit()
			}
			}
			this.state = 253
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,19,context) ) {
			1 -> {if (true){
			this.state = 251
			opt_comment()
			}}
			2 -> {if (true){
			this.state = 252
			opt_sp()
			}}
			}
			this.state = 255
			match(NL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Last_postingContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_last_posting.id
	        set(value) { throw RuntimeException() }
		fun findIndent() : IndentContext? = getRuleContext(solver.getType("IndentContext"),0)
		fun findAccount() : AccountContext? = getRuleContext(solver.getType("AccountContext"),0)
		fun NL() : TerminalNode? = getToken(TxnParser.Tokens.NL.id, 0)
		fun findOpt_comment() : Opt_commentContext? = getRuleContext(solver.getType("Opt_commentContext"),0)
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterLast_posting(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitLast_posting(this)
		}
	}

	fun  last_posting() : Last_postingContext {
		var _localctx : Last_postingContext = Last_postingContext(context, state)
		enterRule(_localctx, 44, Rules.RULE_last_posting.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 257
			indent()
			this.state = 258
			account()
			this.state = 261
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,20,context) ) {
			1 -> {if (true){
			this.state = 259
			opt_comment()
			}}
			2 -> {if (true){
			this.state = 260
			opt_sp()
			}}
			}
			this.state = 263
			match(NL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Opt_unitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opt_unit.id
	        set(value) { throw RuntimeException() }
		fun findSp() : SpContext? = getRuleContext(solver.getType("SpContext"),0)
		fun findUnit() : UnitContext? = getRuleContext(solver.getType("UnitContext"),0)
		fun findOpt_position() : Opt_positionContext? = getRuleContext(solver.getType("Opt_positionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterOpt_unit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitOpt_unit(this)
		}
	}

	fun  opt_unit() : Opt_unitContext {
		var _localctx : Opt_unitContext = Opt_unitContext(context, state)
		enterRule(_localctx, 46, Rules.RULE_opt_unit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 265
			sp()
			this.state = 266
			unit()
			this.state = 268
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,21,context) ) {
			1   -> if (true){
			this.state = 267
			opt_position()
			}
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Opt_commentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opt_comment.id
	        set(value) { throw RuntimeException() }
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		fun findComment() : CommentContext? = getRuleContext(solver.getType("CommentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterOpt_comment(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitOpt_comment(this)
		}
	}

	fun  opt_comment() : Opt_commentContext {
		var _localctx : Opt_commentContext = Opt_commentContext(context, state)
		enterRule(_localctx, 48, Rules.RULE_opt_comment.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 270
			opt_sp()
			this.state = 271
			comment()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Opt_positionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opt_position.id
	        set(value) { throw RuntimeException() }
		fun findOpt_opening_pos() : Opt_opening_posContext? = getRuleContext(solver.getType("Opt_opening_posContext"),0)
		fun findClosing_pos() : Closing_posContext? = getRuleContext(solver.getType("Closing_posContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterOpt_position(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitOpt_position(this)
		}
	}

	fun  opt_position() : Opt_positionContext {
		var _localctx : Opt_positionContext = Opt_positionContext(context, state)
		enterRule(_localctx, 50, Rules.RULE_opt_position.id)
		try {
			this.state = 278
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,22,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 273
			opt_opening_pos()
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 274
			opt_opening_pos()
			this.state = 275
			closing_pos()
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 277
			closing_pos()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Opt_opening_posContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opt_opening_pos.id
	        set(value) { throw RuntimeException() }
		fun findSp() : List<SpContext> = getRuleContexts(solver.getType("SpContext"))
		fun findSp(i: Int) : SpContext? = getRuleContext(solver.getType("SpContext"),i)
		fun findOpt_sp() : List<Opt_spContext> = getRuleContexts(solver.getType("Opt_spContext"))
		fun findOpt_sp(i: Int) : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),i)
		fun findAmount() : AmountContext? = getRuleContext(solver.getType("AmountContext"),0)
		fun findUnit() : UnitContext? = getRuleContext(solver.getType("UnitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterOpt_opening_pos(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitOpt_opening_pos(this)
		}
	}

	fun  opt_opening_pos() : Opt_opening_posContext {
		var _localctx : Opt_opening_posContext = Opt_opening_posContext(context, state)
		enterRule(_localctx, 52, Rules.RULE_opt_opening_pos.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 280
			sp()
			this.state = 281
			match(L_CURLY) as Token
			this.state = 282
			opt_sp()
			this.state = 283
			amount()
			this.state = 284
			sp()
			this.state = 285
			unit()
			this.state = 286
			opt_sp()
			this.state = 287
			match(R_CURLY) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Closing_posContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_closing_pos.id
	        set(value) { throw RuntimeException() }
		fun findSp() : List<SpContext> = getRuleContexts(solver.getType("SpContext"))
		fun findSp(i: Int) : SpContext? = getRuleContext(solver.getType("SpContext"),i)
		fun findAmount() : AmountContext? = getRuleContext(solver.getType("AmountContext"),0)
		fun findUnit() : UnitContext? = getRuleContext(solver.getType("UnitContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterClosing_pos(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitClosing_pos(this)
		}
	}

	fun  closing_pos() : Closing_posContext {
		var _localctx : Closing_posContext = Closing_posContext(context, state)
		enterRule(_localctx, 54, Rules.RULE_closing_pos.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 289
			sp()
			this.state = 290
			_la = _input!!.LA(1)
			if ( !(_la==AT || _la==EQUAL) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			this.state = 291
			sp()
			this.state = 292
			amount()
			this.state = 293
			sp()
			this.state = 294
			unit()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AccountContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_account.id
	        set(value) { throw RuntimeException() }
		fun ID() : List<TerminalNode> = getTokens(TxnParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(TxnParser.Tokens.ID.id, i) as TerminalNode
		fun SUBID() : List<TerminalNode> = getTokens(TxnParser.Tokens.SUBID.id)
		fun SUBID(i: Int) : TerminalNode = getToken(TxnParser.Tokens.SUBID.id, i) as TerminalNode
		fun INT() : List<TerminalNode> = getTokens(TxnParser.Tokens.INT.id)
		fun INT(i: Int) : TerminalNode = getToken(TxnParser.Tokens.INT.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterAccount(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitAccount(this)
		}
	}

	fun  account() : AccountContext {
		var _localctx : AccountContext = AccountContext(context, state)
		enterRule(_localctx, 56, Rules.RULE_account.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 296
			match(ID) as Token
			this.state = 301
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COLON) {
				if (true){
				if (true){
				this.state = 297
				match(COLON) as Token
				this.state = 298
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl INT) or (1L shl ID) or (1L shl SUBID))) != 0L)) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 303
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AmountContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_amount.id
	        set(value) { throw RuntimeException() }
		fun INT() : TerminalNode? = getToken(TxnParser.Tokens.INT.id, 0)
		fun NUMBER() : TerminalNode? = getToken(TxnParser.Tokens.NUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterAmount(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitAmount(this)
		}
	}

	fun  amount() : AmountContext {
		var _localctx : AmountContext = AmountContext(context, state)
		enterRule(_localctx, 58, Rules.RULE_amount.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 304
			_la = _input!!.LA(1)
			if ( !(_la==INT || _la==NUMBER) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class UnitContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_unit.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(TxnParser.Tokens.ID.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterUnit(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitUnit(this)
		}
	}

	fun  unit() : UnitContext {
		var _localctx : UnitContext = UnitContext(context, state)
		enterRule(_localctx, 60, Rules.RULE_unit.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 306
			match(ID) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class SpContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_sp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterSp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitSp(this)
		}
	}

	fun  sp() : SpContext {
		var _localctx : SpContext = SpContext(context, state)
		enterRule(_localctx, 62, Rules.RULE_sp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 309 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 308
				_la = _input!!.LA(1)
				if ( !(_la==SPACE || _la==TAB) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 311 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==SPACE || _la==TAB )
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class Opt_spContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_opt_sp.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterOpt_sp(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitOpt_sp(this)
		}
	}

	fun  opt_sp() : Opt_spContext {
		var _localctx : Opt_spContext = Opt_spContext(context, state)
		enterRule(_localctx, 64, Rules.RULE_opt_sp.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 316
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==SPACE || _la==TAB) {
				if (true){
				if (true){
				this.state = 313
				_la = _input!!.LA(1)
				if ( !(_la==SPACE || _la==TAB) ) {
					errorHandler.recoverInline(this)
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				}
				}
				this.state = 318
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BlanklineContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_blankline.id
	        set(value) { throw RuntimeException() }
		fun findOpt_sp() : Opt_spContext? = getRuleContext(solver.getType("Opt_spContext"),0)
		fun NL() : TerminalNode? = getToken(TxnParser.Tokens.NL.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun enterRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).enterBlankline(this)
		}
		override fun exitRule(listener: ParseTreeListener) {
			if ( listener is TxnParserListener ) (listener as TxnParserListener).exitBlankline(this)
		}
	}

	fun  blankline() : BlanklineContext {
		var _localctx : BlanklineContext = BlanklineContext(context, state)
		enterRule(_localctx, 66, Rules.RULE_blankline.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 319
			opt_sp()
			this.state = 320
			match(NL) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	override fun sempred(_localctx: RuleContext?, ruleIndex: Int, predIndex: Int) : Boolean {
		when (ruleIndex) {
		7 -> return txn_meta_sempred(_localctx as Txn_metaContext, predIndex)
		15 -> return tags_sempred(_localctx as TagsContext, predIndex)
		}
		return true
	}
	private fun txn_meta_sempred( _localctx : Txn_metaContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    0 -> return _localctx.u < 1
		    1 -> return _localctx.l < 1
		    2 -> return _localctx.t < 1
		}
		return true
	}
	private fun tags_sempred( _localctx : TagsContext, predIndex: Int) : Boolean {
		when (predIndex) {
		    3 -> return precpred(context!!, 1)
		}
		return true
	}

}