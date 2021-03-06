package com.zxin.router;

/**
 * Interceptor before route.
 * <p>
 * Created by zxin on 2016/12/20.
 */
public interface RouteInterceptor {
    /**
     * @param source       Context or Fragment instance
     * @param routeRequest RouteRequest
     * @return True if you want to intercept this route, false otherwise.
     */
    boolean intercept(Object source, RouteRequest routeRequest);
}
