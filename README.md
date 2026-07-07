# Bank Account Generated Code

Repositori ini berisi varian-varian dari sistem Bank Account. Masing-masing folder di dalam direktori ini mewakili satu varian dan memiliki struktur berikut:

- **`src/`**: Berisi *source code* (kode yang di-generate) untuk varian tersebut.
- **`mybank/`**: Berisi kode yang sudah di-compile.

## Cara Menjalankan

Untuk menjalankan salah satu varian aplikasi Bank Account, ikuti langkah-langkah berikut:

1. **Konfigurasi Database**: Pastikan Anda sudah menambahkan/menyesuaikan kredensial database PostgreSQL Anda pada file konfigurasi aplikasi.
2. **Jalankan Script**: Eksekusi file `run.bat` untuk menjalankan aplikasi.
3. **Buat Akun**: Sebelum melakukan transfer, Anda perlu membuat akun melalui API berikut: `http://localhost:7776/call/dailylimit/save`
4. **Uji Coba Transfer**: Setelah akun berhasil dibuat, lakukan pengetesan transfer antar akun dengan memanggil API: `http://localhost:7776/call/transfer`
