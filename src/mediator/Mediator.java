package mediator;

public interface Mediator {
    /**
     * 生成被管理的组员
     */
    public abstract void createColleagues();

    /**
     * 让组员向仲裁者报告
     * 本例中当单选按钮和文本输入框状态发生变化时，该方法被调用
     */
    public abstract void colleagueChanged();
}
