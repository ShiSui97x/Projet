package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractSpell {
    public String name;
    public int damage;
    public int successRate;

    public AbstractSpell(String name, int damage, int successRate){
        this.name=name;
        this.damage=damage;
        this.successRate=successRate;
    }

    public void cast(Character target){

    }
}


