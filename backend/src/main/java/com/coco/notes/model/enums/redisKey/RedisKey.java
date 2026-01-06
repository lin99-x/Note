package com.coco.notes.model.enums.redisKey;

/**
 * Redis key management class
 */
public class RedisKey {
    /**
     * Generate register verification code
     * @param email User's email address
     * @return email:register_verification_code:{email}
     */
    public static String registerVerificationCode(String email) {
        return "email:register_verification_code:" + email;
    }

    /**
     * Redis key name for generating registration verification code restrictions
     * Frequency limit for recording user-sent verification codes
     * @param email User's email address
     * @return email:register_verification_code:limit:{email}
     */
    public static String registerVerificationLimitCode(String email) {
        return "email:register_verification_code:limit:" + email;
    }

    /**
     * Redis key name for generating the email task queue
     * @return queue:email:task
     */
    public static String emailTaskQueue() {
        return "queue:email:task";
    }
}
