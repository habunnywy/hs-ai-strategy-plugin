package club.xiaojiawei.hsscriptaistrategy.llm;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u0006\u0010\u0017\u001a\u00020\u0013J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lclub/xiaojiawei/hsscriptaistrategy/llm/LlmClient;", "", "<init>", "()V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "lastResponseTime", "", "getLastResponseTime", "()J", "setLastResponseTime", "(J)V", "httpClient", "Ljava/net/http/HttpClient;", "getHttpClient", "()Ljava/net/http/HttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "chat", "", "messages", "", "Lclub/xiaojiawei/hsscriptaistrategy/llm/ChatMessage;", "testConnection", "fetchModels", "testModel", "model", "buildUrl", "baseUrl", "hs-ai-strategy-plugin"})
public final class LlmClient {
    @org.jetbrains.annotations.NotNull()
    private static final com.fasterxml.jackson.databind.ObjectMapper mapper = null;
    private static long lastResponseTime = 0L;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy httpClient$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final club.xiaojiawei.hsscriptaistrategy.llm.LlmClient INSTANCE = null;
    
    private LlmClient() {
        super();
    }
    
    public final long getLastResponseTime() {
        return 0L;
    }
    
    public final void setLastResponseTime(long p0) {
    }
    
    private final java.net.http.HttpClient getHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String chat(@org.jetbrains.annotations.NotNull()
    java.util.List<club.xiaojiawei.hsscriptaistrategy.llm.ChatMessage> messages) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String testConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> fetchModels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String testModel(@org.jetbrains.annotations.NotNull()
    java.lang.String model) {
        return null;
    }
    
    private final java.lang.String buildUrl(java.lang.String baseUrl) {
        return null;
    }
}