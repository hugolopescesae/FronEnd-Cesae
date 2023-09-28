<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the installation.
 * You don't have to use the web site, you can copy this file to "wp-config.php"
 * and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * Database settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/documentation/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** Database settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'projeto1' );

/** Database username */
define( 'DB_USER', 'root' );

/** Database password */
define( 'DB_PASSWORD', '' );

/** Database hostname */
define( 'DB_HOST', 'localhost' );

/** Database charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The database collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication unique keys and salts.
 *
 * Change these to different unique phrases! You can generate these using
 * the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}.
 *
 * You can change these at any point in time to invalidate all existing cookies.
 * This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '[VG4(Gx6),ypv#0p9T<wC`5nZ?vn*I/l](?[5>aRPby!N6:guzpl5vQQ-jxGX=-r' );
define( 'SECURE_AUTH_KEY',  ';P^,$g.Y+a){_c[E#R+!cG=25nXEf-_0d!qNvw:<A$rF,~4gGxlCVIf9)w-IG>4j' );
define( 'LOGGED_IN_KEY',    '!OSq:YZG6`s7C-iB=Sg8=[~Wk,W2s {wFxa[fqlFW2z<[an)+.lD;[rzNE`n21-(' );
define( 'NONCE_KEY',        'EszsI1mL|Z![/@wW20uQqSsOL~Ky.y7d+]|geOHE:.xlK8~wMX93dCZsJ7L<-z!,' );
define( 'AUTH_SALT',        '+ah`))Tny+ [a:&L2rR8?y/1i,My`t=eB@tPn?475p^dIOmJ|WJrb.L97]w?o,X4' );
define( 'SECURE_AUTH_SALT', '/($:!?=L]3upj> lT:E7=qjPUlvch+AhHMOABOr7,L|{orR{5Nd{{uKE0|l R,c7' );
define( 'LOGGED_IN_SALT',   'bLyoiceV!.W%MtI48}G6|-8Y.R%T9J6:(TAqegbq)u*y;L_AHqe!MRC{~M6v66lE' );
define( 'NONCE_SALT',       'k{e_]r^Lgo8D[{G`Wz:$vf]emyFyZOEw0* Qy1|nJ&>0XZQ~ > rQ ?>ome.gX4C' );

/**#@-*/

/**
 * WordPress database table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/documentation/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* Add any custom values between this line and the "stop editing" line. */



/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
