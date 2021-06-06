package com.basic.api;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.*;

public class ForumDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return this.jdbcTemplate;
    }

    /**
     * 更新一条数据
     *
     * @param forum
     */
    public void addForum(final Forum forum) {
        final String sql = "INSERT INTO t_forum(forum_name,forum_desc) VALUES(?,?)";
        Object[] params = new Object[] { forum.getForumName(),
                forum.getForumDesc() };
        // 方式1
        jdbcTemplate.update(sql, params);

        // 方式2
        // jdbcTemplate.update(sql, params,new
        // int[]{Types.VARCHAR,Types.VARCHAR});

        // 方式3
        /*
         * jdbcTemplate.update(sql, new PreparedStatementSetter() { public void
         * setValues(PreparedStatement ps) throws SQLException { ps.setString(1,
         * forum.getForumName()); ps.setString(2, forum.getForumDesc()); } });
         */

        // 方式4
        /*
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection conn)
                    throws SQLException {
                PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, forum.getForumName());
                ps.setString(2, forum.getForumDesc());
                return ps;
            }
        }, keyHolder);
        forum.setForumId(keyHolder.getKey().intValue());

         */
    }


}
