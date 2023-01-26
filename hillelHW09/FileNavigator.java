package hillelHW09;

import java.util.*;

public class FileNavigator {
    Map<String, List<FileData>> files = new HashMap<>();

    public void add(FileData file) {
        if (files.containsKey(file.getPath())) {
            List<FileData> fileRightPath = files.get(file.getPath());
            fileRightPath.add(file);
        } else {
            List<FileData> fileRightPath = new ArrayList<>();
            fileRightPath.add(file);
            files.put(file.getPath(), fileRightPath);
        }
    }
    public void add(FileData file, String path) throws Exception {
        if (!path.equals(file.getPath()))
            throw new Exception("Wrong path");
        if (files.containsKey(file.getPath())) {
            List<FileData> fileRightPath = files.get(file.getPath());
            fileRightPath.add(file);
        } else {
            List<FileData> fileRightPath = new ArrayList<>();
            fileRightPath.add(file);
            files.put(file.getPath(), fileRightPath);
        }
    }

    public List<FileData> find(String path) {
        return files.get(path);
    }

    public List<FileData> filterBySize(int size) {
        List<FileData> filterList = new ArrayList<>();
        for (List<FileData> fdList : files.values())
            for (FileData fd : fdList)
                if (fd.getSize() <= size)
                    filterList.add(fd);
        return filterList;
    }

    public void remove(String path) {
        files.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sbs = new ArrayList<>();
        for (List<FileData> fdl : files.values())
            sbs.addAll(fdl);
        sbs.sort(Comparator.comparing(FileData::getSize));
        return sbs;
    }
}
