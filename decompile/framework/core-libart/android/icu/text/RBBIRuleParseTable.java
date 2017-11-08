package android.icu.text;

class RBBIRuleParseTable {
    static final short doCheckVarDef = (short) 1;
    static final short doDotAny = (short) 2;
    static final short doEndAssign = (short) 3;
    static final short doEndOfRule = (short) 4;
    static final short doEndVariableName = (short) 5;
    static final short doExit = (short) 6;
    static final short doExprCatOperator = (short) 7;
    static final short doExprFinished = (short) 8;
    static final short doExprOrOperator = (short) 9;
    static final short doExprRParen = (short) 10;
    static final short doExprStart = (short) 11;
    static final short doLParen = (short) 12;
    static final short doNOP = (short) 13;
    static final short doOptionEnd = (short) 14;
    static final short doOptionStart = (short) 15;
    static final short doReverseDir = (short) 16;
    static final short doRuleChar = (short) 17;
    static final short doRuleError = (short) 18;
    static final short doRuleErrorAssignExpr = (short) 19;
    static final short doScanUnicodeSet = (short) 20;
    static final short doSlash = (short) 21;
    static final short doStartAssign = (short) 22;
    static final short doStartTagValue = (short) 23;
    static final short doStartVariableName = (short) 24;
    static final short doTagDigit = (short) 25;
    static final short doTagExpectedError = (short) 26;
    static final short doTagValue = (short) 27;
    static final short doUnaryOpPlus = (short) 28;
    static final short doUnaryOpQuestion = (short) 29;
    static final short doUnaryOpStar = (short) 30;
    static final short doVariableNameExpectedErr = (short) 31;
    static RBBIRuleTableElement[] gRuleParseStateTable = null;
    static final short kRuleSet_default = (short) 255;
    static final short kRuleSet_digit_char = (short) 128;
    static final short kRuleSet_eof = (short) 252;
    static final short kRuleSet_escaped = (short) 254;
    static final short kRuleSet_name_char = (short) 129;
    static final short kRuleSet_name_start_char = (short) 130;
    static final short kRuleSet_rule_char = (short) 131;
    static final short kRuleSet_white_space = (short) 132;

    static class RBBIRuleTableElement {
        short fAction;
        short fCharClass;
        boolean fNextChar;
        short fNextState;
        short fPushState;
        String fStateName;

        RBBIRuleTableElement(short a, int cc, int ns, int ps, boolean nc, String sn) {
            this.fAction = a;
            this.fCharClass = (short) cc;
            this.fNextState = (short) ns;
            this.fPushState = (short) ps;
            this.fNextChar = nc;
            this.fStateName = sn;
        }
    }

    RBBIRuleParseTable() {
    }

    static {
        RBBIRuleTableElement[] rBBIRuleTableElementArr = new RBBIRuleTableElement[96];
        rBBIRuleTableElementArr[0] = new RBBIRuleTableElement((short) 13, 0, 0, 0, true, null);
        rBBIRuleTableElementArr[1] = new RBBIRuleTableElement((short) 11, 254, 21, 8, false, "start");
        rBBIRuleTableElementArr[2] = new RBBIRuleTableElement((short) 13, 132, 1, 0, true, null);
        rBBIRuleTableElementArr[3] = new RBBIRuleTableElement((short) 11, 36, 80, 90, false, null);
        rBBIRuleTableElementArr[4] = new RBBIRuleTableElement((short) 13, 33, 11, 0, true, null);
        rBBIRuleTableElementArr[5] = new RBBIRuleTableElement((short) 13, 59, 1, 0, true, null);
        rBBIRuleTableElementArr[6] = new RBBIRuleTableElement((short) 13, 252, 0, 0, false, null);
        rBBIRuleTableElementArr[7] = new RBBIRuleTableElement((short) 11, 255, 21, 8, false, null);
        rBBIRuleTableElementArr[8] = new RBBIRuleTableElement((short) 4, 59, 1, 0, true, "break-rule-end");
        rBBIRuleTableElementArr[9] = new RBBIRuleTableElement((short) 13, 132, 8, 0, true, null);
        rBBIRuleTableElementArr[10] = new RBBIRuleTableElement(doRuleError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[11] = new RBBIRuleTableElement((short) 13, 33, 13, 0, true, "rev-option");
        rBBIRuleTableElementArr[12] = new RBBIRuleTableElement((short) 16, 255, 20, 8, false, null);
        rBBIRuleTableElementArr[13] = new RBBIRuleTableElement((short) 15, 130, 15, 0, true, "option-scan1");
        rBBIRuleTableElementArr[14] = new RBBIRuleTableElement(doRuleError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[15] = new RBBIRuleTableElement((short) 13, 129, 15, 0, true, "option-scan2");
        rBBIRuleTableElementArr[16] = new RBBIRuleTableElement((short) 14, 255, 17, 0, false, null);
        rBBIRuleTableElementArr[17] = new RBBIRuleTableElement((short) 13, 59, 1, 0, true, "option-scan3");
        rBBIRuleTableElementArr[18] = new RBBIRuleTableElement((short) 13, 132, 17, 0, true, null);
        rBBIRuleTableElementArr[19] = new RBBIRuleTableElement(doRuleError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[20] = new RBBIRuleTableElement((short) 11, 255, 21, 8, false, "reverse-rule");
        rBBIRuleTableElementArr[21] = new RBBIRuleTableElement((short) 17, 254, 30, 0, true, "term");
        rBBIRuleTableElementArr[22] = new RBBIRuleTableElement((short) 13, 132, 21, 0, true, null);
        rBBIRuleTableElementArr[23] = new RBBIRuleTableElement((short) 17, 131, 30, 0, true, null);
        rBBIRuleTableElementArr[24] = new RBBIRuleTableElement((short) 13, 91, 86, 30, false, null);
        rBBIRuleTableElementArr[25] = new RBBIRuleTableElement((short) 12, 40, 21, 30, true, null);
        rBBIRuleTableElementArr[26] = new RBBIRuleTableElement((short) 13, 36, 80, 29, false, null);
        rBBIRuleTableElementArr[27] = new RBBIRuleTableElement((short) 2, 46, 30, 0, true, null);
        rBBIRuleTableElementArr[28] = new RBBIRuleTableElement(doRuleError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[29] = new RBBIRuleTableElement((short) 1, 255, 30, 0, false, "term-var-ref");
        rBBIRuleTableElementArr[30] = new RBBIRuleTableElement((short) 13, 132, 30, 0, true, "expr-mod");
        rBBIRuleTableElementArr[31] = new RBBIRuleTableElement(doUnaryOpStar, 42, 35, 0, true, null);
        rBBIRuleTableElementArr[32] = new RBBIRuleTableElement(doUnaryOpPlus, 43, 35, 0, true, null);
        rBBIRuleTableElementArr[33] = new RBBIRuleTableElement(doUnaryOpQuestion, 63, 35, 0, true, null);
        rBBIRuleTableElementArr[34] = new RBBIRuleTableElement((short) 13, 255, 35, 0, false, null);
        rBBIRuleTableElementArr[35] = new RBBIRuleTableElement((short) 7, 254, 21, 0, false, "expr-cont");
        rBBIRuleTableElementArr[36] = new RBBIRuleTableElement((short) 13, 132, 35, 0, true, null);
        rBBIRuleTableElementArr[37] = new RBBIRuleTableElement((short) 7, 131, 21, 0, false, null);
        rBBIRuleTableElementArr[38] = new RBBIRuleTableElement((short) 7, 91, 21, 0, false, null);
        rBBIRuleTableElementArr[39] = new RBBIRuleTableElement((short) 7, 40, 21, 0, false, null);
        rBBIRuleTableElementArr[40] = new RBBIRuleTableElement((short) 7, 36, 21, 0, false, null);
        rBBIRuleTableElementArr[41] = new RBBIRuleTableElement((short) 7, 46, 21, 0, false, null);
        rBBIRuleTableElementArr[42] = new RBBIRuleTableElement((short) 7, 47, 47, 0, false, null);
        rBBIRuleTableElementArr[43] = new RBBIRuleTableElement((short) 7, 123, 59, 0, true, null);
        rBBIRuleTableElementArr[44] = new RBBIRuleTableElement((short) 9, 124, 21, 0, true, null);
        rBBIRuleTableElementArr[45] = new RBBIRuleTableElement((short) 10, 41, 255, 0, true, null);
        rBBIRuleTableElementArr[46] = new RBBIRuleTableElement((short) 8, 255, 255, 0, false, null);
        rBBIRuleTableElementArr[47] = new RBBIRuleTableElement(doSlash, 47, 49, 0, true, "look-ahead");
        rBBIRuleTableElementArr[48] = new RBBIRuleTableElement((short) 13, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[49] = new RBBIRuleTableElement((short) 7, 254, 21, 0, false, "expr-cont-no-slash");
        rBBIRuleTableElementArr[50] = new RBBIRuleTableElement((short) 13, 132, 35, 0, true, null);
        rBBIRuleTableElementArr[51] = new RBBIRuleTableElement((short) 7, 131, 21, 0, false, null);
        rBBIRuleTableElementArr[52] = new RBBIRuleTableElement((short) 7, 91, 21, 0, false, null);
        rBBIRuleTableElementArr[53] = new RBBIRuleTableElement((short) 7, 40, 21, 0, false, null);
        rBBIRuleTableElementArr[54] = new RBBIRuleTableElement((short) 7, 36, 21, 0, false, null);
        rBBIRuleTableElementArr[55] = new RBBIRuleTableElement((short) 7, 46, 21, 0, false, null);
        rBBIRuleTableElementArr[56] = new RBBIRuleTableElement((short) 9, 124, 21, 0, true, null);
        rBBIRuleTableElementArr[57] = new RBBIRuleTableElement((short) 10, 41, 255, 0, true, null);
        rBBIRuleTableElementArr[58] = new RBBIRuleTableElement((short) 8, 255, 255, 0, false, null);
        rBBIRuleTableElementArr[59] = new RBBIRuleTableElement((short) 13, 132, 59, 0, true, "tag-open");
        rBBIRuleTableElementArr[60] = new RBBIRuleTableElement(doStartTagValue, 128, 62, 0, false, null);
        rBBIRuleTableElementArr[61] = new RBBIRuleTableElement(doTagExpectedError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[62] = new RBBIRuleTableElement((short) 13, 132, 66, 0, true, "tag-value");
        rBBIRuleTableElementArr[63] = new RBBIRuleTableElement((short) 13, 125, 66, 0, false, null);
        rBBIRuleTableElementArr[64] = new RBBIRuleTableElement(doTagDigit, 128, 62, 0, true, null);
        rBBIRuleTableElementArr[65] = new RBBIRuleTableElement(doTagExpectedError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[66] = new RBBIRuleTableElement((short) 13, 132, 66, 0, true, "tag-close");
        rBBIRuleTableElementArr[67] = new RBBIRuleTableElement(doTagValue, 125, 69, 0, true, null);
        rBBIRuleTableElementArr[68] = new RBBIRuleTableElement(doTagExpectedError, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[69] = new RBBIRuleTableElement((short) 7, 254, 21, 0, false, "expr-cont-no-tag");
        rBBIRuleTableElementArr[70] = new RBBIRuleTableElement((short) 13, 132, 69, 0, true, null);
        rBBIRuleTableElementArr[71] = new RBBIRuleTableElement((short) 7, 131, 21, 0, false, null);
        rBBIRuleTableElementArr[72] = new RBBIRuleTableElement((short) 7, 91, 21, 0, false, null);
        rBBIRuleTableElementArr[73] = new RBBIRuleTableElement((short) 7, 40, 21, 0, false, null);
        rBBIRuleTableElementArr[74] = new RBBIRuleTableElement((short) 7, 36, 21, 0, false, null);
        rBBIRuleTableElementArr[75] = new RBBIRuleTableElement((short) 7, 46, 21, 0, false, null);
        rBBIRuleTableElementArr[76] = new RBBIRuleTableElement((short) 7, 47, 47, 0, false, null);
        rBBIRuleTableElementArr[77] = new RBBIRuleTableElement((short) 9, 124, 21, 0, true, null);
        rBBIRuleTableElementArr[78] = new RBBIRuleTableElement((short) 10, 41, 255, 0, true, null);
        rBBIRuleTableElementArr[79] = new RBBIRuleTableElement((short) 8, 255, 255, 0, false, null);
        rBBIRuleTableElementArr[80] = new RBBIRuleTableElement(doStartVariableName, 36, 82, 0, true, "scan-var-name");
        rBBIRuleTableElementArr[81] = new RBBIRuleTableElement((short) 13, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[82] = new RBBIRuleTableElement((short) 13, 130, 84, 0, true, "scan-var-start");
        rBBIRuleTableElementArr[83] = new RBBIRuleTableElement(doVariableNameExpectedErr, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[84] = new RBBIRuleTableElement((short) 13, 129, 84, 0, true, "scan-var-body");
        rBBIRuleTableElementArr[85] = new RBBIRuleTableElement((short) 5, 255, 255, 0, false, null);
        rBBIRuleTableElementArr[86] = new RBBIRuleTableElement(doScanUnicodeSet, 91, 255, 0, true, "scan-unicode-set");
        rBBIRuleTableElementArr[87] = new RBBIRuleTableElement(doScanUnicodeSet, 112, 255, 0, true, null);
        rBBIRuleTableElementArr[88] = new RBBIRuleTableElement(doScanUnicodeSet, 80, 255, 0, true, null);
        rBBIRuleTableElementArr[89] = new RBBIRuleTableElement((short) 13, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[90] = new RBBIRuleTableElement((short) 13, 132, 90, 0, true, "assign-or-rule");
        rBBIRuleTableElementArr[91] = new RBBIRuleTableElement(doStartAssign, 61, 21, 93, true, null);
        rBBIRuleTableElementArr[92] = new RBBIRuleTableElement((short) 13, 255, 29, 8, false, null);
        rBBIRuleTableElementArr[93] = new RBBIRuleTableElement((short) 3, 59, 1, 0, true, "assign-end");
        rBBIRuleTableElementArr[94] = new RBBIRuleTableElement(doRuleErrorAssignExpr, 255, 95, 0, false, null);
        rBBIRuleTableElementArr[95] = new RBBIRuleTableElement((short) 6, 255, 95, 0, true, "errorDeath");
        gRuleParseStateTable = rBBIRuleTableElementArr;
    }
}