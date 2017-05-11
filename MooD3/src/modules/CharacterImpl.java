package modules;

import interfaces.Character;

/**
 * Created by valentin on 26.03.17.
 */
public abstract class CharacterImpl<T extends Number> implements Character<T> {

    private String userName;
    private String hashedPassword;
    private int level;

    public CharacterImpl(String userName, int level) {
        this.setUserName(userName);
        this.setHashedPassword(this.hashedPassword);
        this.setLevel(level);
    }

    @Override
    public String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getHashPassword() {
        return hashedPassword;
    }

    protected void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    @Override
    public int getLevel() {
        return level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n",
                this.getUserName(),
                this.getHashPassword(),
                this.getClass().getSimpleName());
    }
}
