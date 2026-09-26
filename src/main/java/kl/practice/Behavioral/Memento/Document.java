package kl.practice.Behavioral.Memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Document {
    private String text;

    public Memento save(){
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        if(memento == null){
            return;
        }
        this.text = memento.getSavedText();
    }

    public static class Memento{
        private String text;

        private Memento(String text){
            this.text = text;
        }

        private String getSavedText(){
            return this.text;
        }

    }

}
