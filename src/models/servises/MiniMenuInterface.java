package models.servises;

import java.util.LinkedList;

public interface MiniMenuInterface {
    String createMenu(MiniMenu miniMenu);
    String removeMenu(Long id);
    LinkedList<MiniMenu> getallmenu();
    LinkedList<MiniMenu> sortByPrice(String eckOrDesk);
    MiniMenu getbyNAme(String name);
}
