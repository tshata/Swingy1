package za.co.wethinkcode.swingy.view;

public interface SelectHeroView {

    void start();

    void updateInfo(String info);

    void showErrorMessage(String message);

    void openGame();

    void openCreateHero();
}
