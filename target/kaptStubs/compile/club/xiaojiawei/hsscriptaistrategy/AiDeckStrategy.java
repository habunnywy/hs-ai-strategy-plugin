package club.xiaojiawei.hsscriptaistrategy;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J \u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J!\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\b\"\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a8\u0006\u001c"}, d2 = {"Lclub/xiaojiawei/hsscriptaistrategy/AiDeckStrategy;", "Lclub/xiaojiawei/hsscriptstrategysdk/DeckStrategy;", "<init>", "()V", "name", "", "description", "getRunMode", "", "Lclub/xiaojiawei/hsscriptbase/enums/RunModeEnum;", "()[Lclub/xiaojiawei/hsscriptbase/enums/RunModeEnum;", "deckCode", "id", "executeChangeCard", "", "cards", "Ljava/util/HashSet;", "Lclub/xiaojiawei/hsscriptcardsdk/bean/Card;", "Lkotlin/collections/HashSet;", "executeOutCard", "executeDiscoverChooseCard", "", "([Lclub/xiaojiawei/hsscriptcardsdk/bean/Card;)I", "fallbackExecute", "me", "Lclub/xiaojiawei/hsscriptcardsdk/bean/Player;", "rival", "simpleFallback", "hs-ai-strategy-plugin"})
public final class AiDeckStrategy extends club.xiaojiawei.hsscriptstrategysdk.DeckStrategy {
    
    public AiDeckStrategy() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String name() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String description() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected club.xiaojiawei.hsscriptbase.enums.RunModeEnum[] getRunMode() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String deckCode() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String id() {
        return null;
    }
    
    @java.lang.Override()
    public void executeChangeCard(@org.jetbrains.annotations.NotNull()
    java.util.HashSet<club.xiaojiawei.hsscriptcardsdk.bean.Card> cards) {
    }
    
    @java.lang.Override()
    public void executeOutCard() {
    }
    
    @java.lang.Override()
    public int executeDiscoverChooseCard(@org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptcardsdk.bean.Card... cards) {
        return 0;
    }
    
    private final void fallbackExecute(club.xiaojiawei.hsscriptcardsdk.bean.Player me, club.xiaojiawei.hsscriptcardsdk.bean.Player rival) {
    }
    
    private final void simpleFallback(club.xiaojiawei.hsscriptcardsdk.bean.Player me, club.xiaojiawei.hsscriptcardsdk.bean.Player rival) {
    }
}