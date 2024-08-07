package com.fullcycle.admin.catalogo.domain;

import java.util.List;

public record Pagination<T>(
        int currentPage,
        int perPage,
        long total,
        List<T> items
) {}
