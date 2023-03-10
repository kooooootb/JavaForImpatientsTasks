public class task_12 {
    // TreeInfo.java
//public static JCTree innermostType(JCTree type, boolean skipAnnos) {
//        JCTree lastAnnotatedType = null;
//        JCTree cur = type;
//        loop: while (true) {
//        switch (cur.getTag()) {
//        case TYPEARRAY:
//        lastAnnotatedType = null;
//        cur = ((JCArrayTypeTree)cur).elemtype;
//        break;
//        case WILDCARD:
//        lastAnnotatedType = null;
//        cur = ((JCWildcard)cur).inner;
//        break;
//        case ANNOTATED_TYPE:
//        lastAnnotatedType = cur;
//        cur = ((JCAnnotatedType)cur).underlyingType;
//        break;
//default:
//        break loop;
//        }
//        }
//        if (!skipAnnos && lastAnnotatedType!=null) {
//        return lastAnnotatedType;
//        } else {
//        return cur;
//        }
//        }

    public static JCTree innermostType(JCTree type, boolean skipAnnos) {
        JCTree lastAnnotatedType = null;
        JCTree cur = type;
        while (true) {
            switch (cur.getTag()) {
                case TYPEARRAY:
                    lastAnnotatedType = null;
                    cur = ((JCArrayTypeTree)cur).elemtype;
                    break;
                case WILDCARD:
                    lastAnnotatedType = null;
                    cur = ((JCWildcard)cur).inner;
                    break;
                case ANNOTATED_TYPE:
                    lastAnnotatedType = cur;
                    cur = ((JCAnnotatedType)cur).underlyingType;
                    break;
                default:
                    flag = true;
                    break;
            }
            if(flag) break;
        }
        if (!skipAnnos && lastAnnotatedType!=null) {
            return lastAnnotatedType;
        } else {
            return cur;
        }
    }
}
