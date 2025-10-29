package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SanPham {
    private String ma;
    private String ten;
    private Integer namBaoHanh;
    private Float gia;
    private Integer soLuong;
    private String danhMuc;
}
