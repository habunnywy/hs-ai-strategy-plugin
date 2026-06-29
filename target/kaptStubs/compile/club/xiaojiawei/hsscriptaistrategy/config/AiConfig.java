package club.xiaojiawei.hsscriptaistrategy.config;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001aJ\u000e\u0010'\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010*\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020\u00162\u0006\u0010&\u001a\u00020 J\u000e\u0010,\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006-"}, d2 = {"Lclub/xiaojiawei/hsscriptaistrategy/config/AiConfig;", "", "<init>", "()V", "SECTION", "", "CONFIG_FILE_NAME", "configFile", "Ljava/io/File;", "getConfigFile", "()Ljava/io/File;", "configFile$delegate", "Lkotlin/Lazy;", "ini", "Lorg/ini4j/Ini;", "getIni", "()Lorg/ini4j/Ini;", "ini$delegate", "get", "key", "default", "put", "", "value", "save", "isEnabled", "", "baseUrl", "provider", "model", "apiKey", "timeout", "", "temperature", "", "fallbackStrategyId", "includeDesc", "setEnabled", "v", "setBaseUrl", "setProvider", "setModel", "setApiKey", "setTimeout", "setIncludeDesc", "hs-ai-strategy-plugin"})
public final class AiConfig {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SECTION = "ai";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CONFIG_FILE_NAME = "script.ini";
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy configFile$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy ini$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final club.xiaojiawei.hsscriptaistrategy.config.AiConfig INSTANCE = null;
    
    private AiConfig() {
        super();
    }
    
    private final java.io.File getConfigFile() {
        return null;
    }
    
    private final org.ini4j.Ini getIni() {
        return null;
    }
    
    private final java.lang.String get(java.lang.String key, java.lang.String p1_772401952) {
        return null;
    }
    
    private final void put(java.lang.String key, java.lang.String value) {
    }
    
    public final void save() {
    }
    
    public final boolean isEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String baseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String provider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String model() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String apiKey() {
        return null;
    }
    
    public final int timeout() {
        return 0;
    }
    
    public final double temperature() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String fallbackStrategyId() {
        return null;
    }
    
    public final boolean includeDesc() {
        return false;
    }
    
    public final void setEnabled(boolean v) {
    }
    
    public final void setBaseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void setProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void setModel(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void setApiKey(@org.jetbrains.annotations.NotNull()
    java.lang.String v) {
    }
    
    public final void setTimeout(int v) {
    }
    
    public final void setIncludeDesc(boolean v) {
    }
}