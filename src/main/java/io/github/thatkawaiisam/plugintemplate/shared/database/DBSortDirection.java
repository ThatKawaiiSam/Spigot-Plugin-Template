package io.github.thatkawaiisam.plugintemplate.shared.database;

import lombok.Getter;

@Getter
public enum DBSortDirection {

    ASCENDING(1), DESCENDING(-1);

    private int value;

    DBSortDirection(int value) {
        this.value = value;
    }
}
