package Exercício6;

class Person implements IEntityValidation {
    
    @Override
    public String toString(){
        return "Type: Person";
    }

    @Override
    public boolean isValid() {
        return false;
    }   
}
