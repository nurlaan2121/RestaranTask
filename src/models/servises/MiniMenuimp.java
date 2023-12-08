package models.servises;

import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;

public class MiniMenuimp implements MiniMenuInterface{

    @Override
    public String createMenu(MiniMenu miniMenu) {
        DataBazeMenu.allmenu.add(miniMenu);
        return "Success";
    }

    @Override
    public String removeMenu(Long id) {
        for (int i = 0; i < DataBazeMenu.allmenu.size(); i++) {
            if (id.equals(DataBazeMenu.allmenu.get(i).getId())){
                DataBazeMenu.allmenu.remove(i);
                return "Success";
            }
        }
        return "Not ID";
    }

    @Override
    public LinkedList<MiniMenu> getallmenu() {
        return DataBazeMenu.allmenu;
    }

    @Override
    public LinkedList<MiniMenu> sortByPrice(String eckOrDesk) {
        if (eckOrDesk.equalsIgnoreCase("Esc")){
            LinkedList<MiniMenu> newsor = new LinkedList<>(DataBazeMenu.allmenu);

            newsor.sort(MiniMenuimp.sortByName);
            return newsor;
        } else if (eckOrDesk.equalsIgnoreCase("Desk")) {
            LinkedList<MiniMenu> eee = new LinkedList<>(DataBazeMenu.allmenu);
            eee.sort(MiniMenuimp.sortByName.reversed());
            return eee;
        }
        return null;
    }

    @Override
    public MiniMenu getbyNAme(String name) {
        for (int i = 0; i < DataBazeMenu.allmenu.size(); i++) {
            if (name.equals(DataBazeMenu.allmenu.get(i).getName())){
                return DataBazeMenu.allmenu.get(i);
            }
        }
        return null;
    }
    public static Comparator<MiniMenu> sortByName = new Comparator<MiniMenu>() {
        @Override
        public int compare(MiniMenu o1, MiniMenu o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    };
}
