/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.apache.dubbo.common.timer;

/**
 * Timeout 对象与 TimerTask 对象一一对应，两者的关系类似于线程池返回的 Future 对象与提交到线程池中的任务对象之间的关系。
 * 通过 Timeout 对象，我们不仅可以查看定时任务的状态，还可以操作定时任务
 */
public interface Timeout {

    /**
     * 返回创建自己的定时器
     */
    Timer timer();

    /**
     * 返回关联的定时任务
     */
    TimerTask task();

    /**
     * 返回定时任务是否到期
     */
    boolean isExpired();

    /**
     * 返回定时任务是否被取消
     */
    boolean isCancelled();

    /**
     * 尝试取消定时任务，如果任务已经被执行或已经取消，方法正常返回.
     *
     * @return True if the cancellation completed successfully, otherwise false
     */
    boolean cancel();
}