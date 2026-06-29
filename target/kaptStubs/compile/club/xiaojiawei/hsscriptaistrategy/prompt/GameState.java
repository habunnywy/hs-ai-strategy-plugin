package club.xiaojiawei.hsscriptaistrategy.prompt;

@com.fasterxml.jackson.databind.annotation.JsonNaming(value = com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy.class)
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0018\u0010\u0019J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u00104\u001a\u00020\u0010H\u00c6\u0003J\t\u00105\u001a\u00020\u0012H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0012H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010:\u001a\u00020\u0010H\u00c6\u0003J\u00a3\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u0012H\u00d6\u0001J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\u0017\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010&\u00a8\u0006A"}, d2 = {"Lclub/xiaojiawei/hsscriptaistrategy/prompt/GameState;", "", "turn", "", "myHero", "Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroInfo;", "myHand", "", "Lclub/xiaojiawei/hsscriptaistrategy/prompt/HandCardInfo;", "myBoard", "Lclub/xiaojiawei/hsscriptaistrategy/prompt/BoardCardInfo;", "myWeapon", "Lclub/xiaojiawei/hsscriptaistrategy/prompt/WeaponInfo;", "myHeroPower", "Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroPowerInfo;", "myMana", "Lclub/xiaojiawei/hsscriptaistrategy/prompt/ManaInfo;", "myDeckCount", "", "rivalHero", "rivalHandCount", "rivalBoard", "rivalHeroPower", "rivalMana", "<init>", "(Ljava/lang/String;Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroInfo;Ljava/util/List;Ljava/util/List;Lclub/xiaojiawei/hsscriptaistrategy/prompt/WeaponInfo;Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroPowerInfo;Lclub/xiaojiawei/hsscriptaistrategy/prompt/ManaInfo;ILclub/xiaojiawei/hsscriptaistrategy/prompt/HeroInfo;ILjava/util/List;Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroPowerInfo;Lclub/xiaojiawei/hsscriptaistrategy/prompt/ManaInfo;)V", "getTurn", "()Ljava/lang/String;", "getMyHero", "()Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroInfo;", "getMyHand", "()Ljava/util/List;", "getMyBoard", "getMyWeapon", "()Lclub/xiaojiawei/hsscriptaistrategy/prompt/WeaponInfo;", "getMyHeroPower", "()Lclub/xiaojiawei/hsscriptaistrategy/prompt/HeroPowerInfo;", "getMyMana", "()Lclub/xiaojiawei/hsscriptaistrategy/prompt/ManaInfo;", "getMyDeckCount", "()I", "getRivalHero", "getRivalHandCount", "getRivalBoard", "getRivalHeroPower", "getRivalMana", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "toString", "hs-ai-strategy-plugin"})
public final class GameState {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String turn = null;
    @org.jetbrains.annotations.NotNull()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo myHero = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.HandCardInfo> myHand = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> myBoard = null;
    @org.jetbrains.annotations.Nullable()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.WeaponInfo myWeapon = null;
    @org.jetbrains.annotations.Nullable()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo myHeroPower = null;
    @org.jetbrains.annotations.NotNull()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo myMana = null;
    private final int myDeckCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo rivalHero = null;
    private final int rivalHandCount = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> rivalBoard = null;
    @org.jetbrains.annotations.Nullable()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo rivalHeroPower = null;
    @org.jetbrains.annotations.NotNull()
    private final club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo rivalMana = null;
    
    public GameState(@org.jetbrains.annotations.NotNull()
    java.lang.String turn, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo myHero, @org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.HandCardInfo> myHand, @org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> myBoard, @org.jetbrains.annotations.Nullable()
    club.xiaojiawei.hsscriptaistrategy.prompt.WeaponInfo myWeapon, @org.jetbrains.annotations.Nullable()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo myHeroPower, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo myMana, int myDeckCount, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo rivalHero, int rivalHandCount, @org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> rivalBoard, @org.jetbrains.annotations.Nullable()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo rivalHeroPower, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo rivalMana) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTurn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo getMyHero() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.HandCardInfo> getMyHand() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> getMyBoard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.WeaponInfo getMyWeapon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo getMyHeroPower() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo getMyMana() {
        return null;
    }
    
    public final int getMyDeckCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo getRivalHero() {
        return null;
    }
    
    public final int getRivalHandCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> getRivalBoard() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo getRivalHeroPower() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo getRivalMana() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.HandCardInfo> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.WeaponInfo component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.xiaojiawei.hsscriptaistrategy.prompt.GameState copy(@org.jetbrains.annotations.NotNull()
    java.lang.String turn, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo myHero, @org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.HandCardInfo> myHand, @org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> myBoard, @org.jetbrains.annotations.Nullable()
    club.xiaojiawei.hsscriptaistrategy.prompt.WeaponInfo myWeapon, @org.jetbrains.annotations.Nullable()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo myHeroPower, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo myMana, int myDeckCount, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroInfo rivalHero, int rivalHandCount, @org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.prompt.BoardCardInfo> rivalBoard, @org.jetbrains.annotations.Nullable()
    club.xiaojiawei.hsscriptaistrategy.prompt.HeroPowerInfo rivalHeroPower, @org.jetbrains.annotations.NotNull()
    club.xiaojiawei.hsscriptaistrategy.prompt.ManaInfo rivalMana) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}