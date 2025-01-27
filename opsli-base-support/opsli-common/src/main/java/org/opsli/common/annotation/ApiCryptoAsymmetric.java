/**
 * Copyright 2020 OPSLI 快速开发平台 https://www.opsli.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opsli.common.annotation;


import java.lang.annotation.*;

/**
 * Api非对称加解密
 *
 * @author Parker
 * @date 2021年5月18日14:46:02
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiCryptoAsymmetric {

    /** 加密启用状态 */
    boolean enable() default true;

    /** 请求解密 */
    boolean requestDecrypt() default true;

    /** 返回加密 */
    boolean responseEncrypt() default true;

}
