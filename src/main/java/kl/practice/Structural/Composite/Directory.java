package kl.practice.Structural.Composite;

import java.util.List;

public class Directory implements FileSystem{
    private int size;
    private List<FileSystem> files;
    private String name;
    private int fileCount=1;

    public Directory(List files, String name){
        this.files=files;

        for (int i = 0; i < this.files.size() ; i++) {
            size += this.files.get(i).getSize();
        }

        for (int i = 0; i < this.files.size() ; i++) {
            fileCount += this.files.get(i).fileCount();
        }

        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        for (int i=0; i< files.size(); i++){
            files.get(i).print();
        }
    }

    @Override
    public void delete() {
        for (int i=0; i< files.size(); i++){
            files.get(i).delete();
        }
        System.out.println("deleting directory "+name);
    }

    @Override
    public int fileCount() {
        return fileCount;
    }

}
