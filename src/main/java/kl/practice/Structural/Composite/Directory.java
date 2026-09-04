package kl.practice.Structural.Composite;

import java.util.List;

public class Directory implements FileSystem{
    private int size;
    private List<FileSystem> files;

    public Directory(List files){
        this.files=files;
        for (int i = 0; i < this.files.size() ; i++) {
            size += this.files.get(i).getSize();
        }
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

}
