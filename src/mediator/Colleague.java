package mediator;

public interface Colleague {

    /**
     * 设置组员的仲裁者
     * @param mediator
     */
    public abstract void setMediator(Mediator mediator);

    /**
     * 告知组员仲裁者下达的指示
     * @param enabled 由仲裁者决定当前组员的启用/禁用状态
     */
    public abstract void setColleagueEnabled(boolean enabled);
}
