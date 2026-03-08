package club.entry;

public class ClubRules {
    private final int COST_MAN = 500;
    private final int COST_WOMAN = 0;

    public String checkEntry(Visitor visitor){
        if (visitor.getAge() < 18) {
            return "Возраст " + visitor.getName() + ":" + visitor.getAge() + ". " + "Вход до 18 строго запрещен!";
        } else if (visitor.isWoman()) {
            return "Стоимость входа для " + visitor.getName() + ": " + COST_WOMAN + " рублей";
        } else {
            return "Стоимость входа для " + visitor.getName() + ": " + COST_MAN + " рублей";
        }
    }
}
