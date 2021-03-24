public class Test {

}


//public class CourseFactory {
//    public ICourse create(String className) {
//        try {
//            if (!(null == className || "".equals(className))) {
//                return (ICourse) Class.forName(className).newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}

//public class CourseFactory {
//    public ICourse create(Class<? extends ICourse> clazz) {
//        try {
//            if (clazz!=null) {
//                return clazz.getDeclaredConstructor().newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
