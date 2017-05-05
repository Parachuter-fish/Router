package com.lzh.nonview.router.route;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lzh.nonview.router.extras.ActivityRouteBundleExtras;
import com.lzh.nonview.router.interceptors.RouteInterceptor;
import com.lzh.nonview.router.interceptors.RouteInterceptorAction;

import java.util.ArrayList;
import java.util.List;

public interface IActivityRoute extends RouteInterceptorAction<IActivityRoute>, IBaseRoute<IActivityRoute> {

    /**
     * Create intent by extras data and bundle that parsed by uri
     * @param context The context to create intent
     * @return Intent that contains of extras data and bundle that parsed by uri
     */
    Intent createIntent (Context context);

    /**
     * set request code for {@link android.app.Activity#startActivityForResult(Intent, int)}
     * @param requestCode request code
     * @return IActivityRoute
     */
    IActivityRoute requestCode(int requestCode);

    /**
     * set anim to apply to {@link android.app.Activity#overridePendingTransition(int, int)}
     * @param enterAnim enter animation
     * @param exitAnim exit animation
     * @return IActivityRoute
     */
    IActivityRoute setAnim (int enterAnim, int exitAnim);

    /**
     * {@link Intent#addFlags(int)}
     * @param flag flag
     * @return IActivityRoute
     */
    IActivityRoute addFlags(int flag);

    IActivityRoute EMPTY = new IActivityRoute() {
        @Override
        public Intent createIntent(Context context) {
            return new Intent();
        }

        @Override
        public IActivityRoute requestCode(int requestCode) {
            return this;
        }

        @Override
        public IActivityRoute setAnim(int enterAnim, int exitAnim) {
            return this;
        }

        @Override
        public IActivityRoute addFlags(int flag) {
            return this;
        }

        @Override
        public IActivityRoute addInterceptor(RouteInterceptor interceptor) {
            return this;
        }

        @Override
        public IActivityRoute removeInterceptor(RouteInterceptor interceptor) {
            return this;
        }

        @Override
        public IActivityRoute removeAllInterceptors() {
            return this;
        }

        @Override
        public List<RouteInterceptor> getInterceptors() {
            return new ArrayList<>();
        }

        @Override
        public void open(Context context) {

        }

        @Override
        public IActivityRoute addExtras(Bundle extras) {
            return this;
        }
    };
}
