package hillelHW09;

public class Main {
    public static void main(String[] args) throws Exception {
        FileNavigator fileNavigator = new FileNavigator();
        String path1 = "documents";
        String path2 = "programFiles";
        String path3 = "recycleBin";
        int size1 = 100;
        int size2 = 120;
        int size3 = 130;
//        fileNavigator.add(new FileData("fileOne", path1, size1));
//        fileNavigator.add(new FileData("fileTwo", path2, size2));
//        fileNavigator.add(new FileData("fileThree", path3, size3));
        fileNavigator.add(new FileData("bilibirda", "bilibirda", 256));
        FileData f5 = new FileData("f5", path1, size3);
        FileData f6 = new FileData("f6", path1, size1);
        FileData f7 = new FileData("f7", path3, size2);
        fileNavigator.add(f5);
        fileNavigator.add(f6);
        fileNavigator.add(f7);
//        System.out.println(fileNavigator.files);
//        System.out.println(fileNavigator.files.get(path1));
//        System.out.println(fileNavigator.find(path3));
//        System.out.println(fileNavigator.filterBySize(size1));
//        fileNavigator.files.remove(path1);
//        fileNavigator.remove(path3);
        System.out.println(fileNavigator.files);
//        System.out.println(fileNavigator.sortBySize());
        fileNavigator.add(new FileData("bilibirda", path1, 256),path2);
        System.out.println(fileNavigator.files);


    }
}
